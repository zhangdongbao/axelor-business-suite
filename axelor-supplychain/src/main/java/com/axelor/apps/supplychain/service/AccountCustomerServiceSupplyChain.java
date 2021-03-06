/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2018 Axelor (<http://axelor.com>).
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
package com.axelor.apps.supplychain.service;

import com.axelor.apps.account.db.AccountingSituation;
import com.axelor.apps.account.db.repo.AccountingSituationRepository;
import com.axelor.apps.account.service.AccountCustomerService;
import com.axelor.apps.account.service.AccountingSituationService;
import com.axelor.apps.base.db.Partner;
import com.axelor.apps.base.service.administration.GeneralService;
import com.axelor.exception.AxelorException;
import com.axelor.inject.Beans;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

public class AccountCustomerServiceSupplyChain extends AccountCustomerService {

	@Inject
	public AccountCustomerServiceSupplyChain(AccountingSituationService accountingSituationService,
			AccountingSituationRepository accSituationRepo, GeneralService generalService) {
		super(accountingSituationService, accSituationRepo, generalService);
	}

	@Override
	@Transactional(rollbackOn = { AxelorException.class, Exception.class })
	public void updateCustomerAccount(AccountingSituation accountingSituation) throws AxelorException {
		super.updateCustomerAccount(accountingSituation);
		updateCustomerCreditLines(accountingSituation.getPartner());
	}

	@Override
	@Transactional(rollbackOn = { AxelorException.class, Exception.class })
	public AccountingSituation updateAccountingSituationCustomerAccount(AccountingSituation accountingSituation,
			boolean updateCustAccount, boolean updateDueCustAccount, boolean updateDueReminderCustAccount)
			throws AxelorException {

		accountingSituation = super.updateAccountingSituationCustomerAccount(accountingSituation, updateCustAccount,
				updateDueCustAccount, updateDueReminderCustAccount);

		if (updateCustAccount) {
			updateCustomerCreditLines(accountingSituation.getPartner());
		}

		return accountingSituation;
	}

	@Override
	@Transactional(rollbackOn = { AxelorException.class, Exception.class })
	public void updateCustomerCreditLines(Partner partner) throws AxelorException {
		if (!partner.getIsContact() && partner.getIsCustomer()
				&& Beans.get(GeneralService.class).getGeneral().getManageCustomerCredit()) {
			Beans.get(CustomerCreditLineService.class).updateLines(partner);
		}
	}

}
