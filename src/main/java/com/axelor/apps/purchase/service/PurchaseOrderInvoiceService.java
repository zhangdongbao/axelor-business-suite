/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2012-2014 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.purchase.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axelor.apps.account.db.IInvoice;
import com.axelor.apps.account.db.Invoice;
import com.axelor.apps.account.db.InvoiceLine;
import com.axelor.apps.account.db.TaxLine;
import com.axelor.apps.account.service.invoice.generator.InvoiceGenerator;
import com.axelor.apps.account.service.invoice.generator.InvoiceLineGenerator;
import com.axelor.apps.base.db.Product;
import com.axelor.apps.base.db.ProductVariant;
import com.axelor.apps.base.db.Unit;
import com.axelor.apps.base.service.CurrencyService;
import com.axelor.apps.purchase.db.PurchaseOrder;
import com.axelor.apps.purchase.db.PurchaseOrderLine;
import com.axelor.exception.AxelorException;
import com.axelor.exception.db.IException;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

public class PurchaseOrderInvoiceService {

	private static final Logger LOG = LoggerFactory.getLogger(PurchaseOrderInvoiceService.class);

	@Inject
	private CurrencyService currencyService;

	@Transactional(rollbackOn = {AxelorException.class, Exception.class})
	public Invoice generateInvoice(PurchaseOrder purchaseOrder) throws AxelorException  {

		Invoice invoice = this.createInvoice(purchaseOrder);
		invoice.save();
		
		if(invoice != null) {
			purchaseOrder.setInvoice(invoice);
			purchaseOrder.save();
		}
		return invoice;
	}

	public Invoice createInvoice(PurchaseOrder purchaseOrder) throws AxelorException{

		InvoiceGenerator invoiceGenerator = this.createInvoiceGenerator(purchaseOrder);

		Invoice invoice = invoiceGenerator.generate();

		invoiceGenerator.populate(invoice, this.createInvoiceLines(invoice, purchaseOrder.getPurchaseOrderLineList()));
		return invoice;
	}

	public InvoiceGenerator createInvoiceGenerator(PurchaseOrder purchaseOrder) throws AxelorException  {

		if(purchaseOrder.getCurrency() == null)  {
			throw new AxelorException(String.format("Veuillez selectionner une devise pour la commande %s ", purchaseOrder.getPurchaseOrderSeq()), IException.CONFIGURATION_ERROR);
		}

		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(IInvoice.SUPPLIER_PURCHASE, purchaseOrder.getCompany(), purchaseOrder.getSupplierPartner(), 
				purchaseOrder.getContactPartner(), purchaseOrder.getProject(), purchaseOrder.getPriceList(), purchaseOrder.getPurchaseOrderSeq(), purchaseOrder.getExternalReference()) {

			@Override
			public Invoice generate() throws AxelorException {

				return super.createInvoiceHeader();
			}
		};

		return invoiceGenerator;
	}

	public List<InvoiceLine> createInvoiceLines(Invoice invoice, List<PurchaseOrderLine> purchaseOrderLineList) throws AxelorException  {

		List<InvoiceLine> invoiceLineList = new ArrayList<InvoiceLine>();

		for(PurchaseOrderLine purchaseOrderLine : purchaseOrderLineList) {

			invoiceLineList.addAll(this.createInvoiceLine(invoice, purchaseOrderLine));
		}
		return invoiceLineList;
	}
	
	public List<InvoiceLine> createInvoiceLine(Invoice invoice, Product product, String productName, BigDecimal price, String description, BigDecimal qty,
			Unit unit, TaxLine taxLine, ProductVariant productVariant, BigDecimal discountAmount, int discountTypeSelect, BigDecimal exTaxTotal) throws AxelorException  {
		
		InvoiceLineGenerator invoiceLineGenerator = new InvoiceLineGenerator(invoice, product, productName, price, description, qty, unit, taxLine, null, product.getInvoiceLineType(), 
				discountAmount, discountTypeSelect, exTaxTotal, false)  {
			@Override
			public List<InvoiceLine> creates() throws AxelorException {
				
				InvoiceLine invoiceLine = this.createInvoiceLine();
				
				List<InvoiceLine> invoiceLines = new ArrayList<InvoiceLine>();
				invoiceLines.add(invoiceLine);
				
				return invoiceLines;
			}
		};
		
		return invoiceLineGenerator.creates();
	}
	
	public List<InvoiceLine> createInvoiceLine(Invoice invoice, PurchaseOrderLine purchaseOrderLine) throws AxelorException {
		
		return this.createInvoiceLine(invoice, purchaseOrderLine.getProduct(), purchaseOrderLine.getProductName(), 
				purchaseOrderLine.getPrice(), purchaseOrderLine.getDescription(), purchaseOrderLine.getQty(), purchaseOrderLine.getUnit(), purchaseOrderLine.getTaxLine(), 
				purchaseOrderLine.getProductVariant(), purchaseOrderLine.getDiscountAmount(), purchaseOrderLine.getDiscountTypeSelect(), purchaseOrderLine.getExTaxTotal());
	}
			
}
