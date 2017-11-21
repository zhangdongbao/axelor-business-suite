/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2017 Axelor (<http://axelor.com>).
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

package com.axelor.apps.prestashop.service.imports.batch;

import java.lang.invoke.MethodHandles;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axelor.apps.prestashop.exception.IExceptionMessage;
import com.axelor.apps.prestashop.service.imports.PrestaShopServiceImport;
import com.axelor.db.JPA;
import com.axelor.exception.AxelorException;
import com.axelor.i18n.I18n;
import com.axelor.meta.db.MetaFile;
import com.google.inject.persist.Transactional;

public class ImportPrestaShop extends BatchStrategyImport {

	private static final Logger LOG = LoggerFactory.getLogger( MethodHandles.lookup().lookupClass() );

	@Inject
	public ImportPrestaShop(PrestaShopServiceImport prestaShopServiceImport) {
		
		super(prestaShopServiceImport);
	}

	@Override
	protected void start() throws IllegalArgumentException, IllegalAccessException, AxelorException {
		
		super.start();
		
	}
	
	@Override
	@Transactional
	protected void process() {
			
			int i = 0;
			
			try {
				MetaFile importFile = prestaShopServiceImport.importPrestShop();
				batch.getPrestaShopBatch().setPrestaShopBatchLog(importFile);
				batchRepo.save(batch);
				i++;
				
			} catch (Exception e) {
				incrementAnomaly();
				LOG.error("Bug(Anomalie) généré(e) pour le rappel de l'évènement {}", batch.getId());
				
			} finally {
				
				if (i % 1 == 0) { JPA.clear(); }
		}
	}

	/**
	 * As {@code batch} entity can be detached from the session, call {@code Batch.find()} get the entity in the persistant context.
	 * Warning : {@code batch} entity have to be saved before.
	 */
	@Override
	protected void stop() {

		String comment = I18n.get(IExceptionMessage.BATCH_IMPORT);
		comment += String.format("\t* %s "+I18n.get(IExceptionMessage.BATCH_DONE)+"\n", batch.getDone());
		comment += String.format("\t* %s "+I18n.get(IExceptionMessage.BATCH_ANOMALY), batch.getAnomaly());
		
		super.stop();
		addComment(comment);
	}
}