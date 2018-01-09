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
package com.axelor.apps.base.web;

import com.axelor.apps.base.db.Querie;
import com.axelor.apps.base.exceptions.IExceptionMessage;
import com.axelor.apps.base.service.querie.QuerieService;
import com.axelor.exception.service.TraceBackService;
import com.axelor.i18n.I18n;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;

public class QuerieController {
	
	@Inject
	private QuerieService qs;
	
	public void checkQuerie(ActionRequest request, ActionResponse response){
		
		try {
			qs.checkQuerie(request.getContext().asType(Querie.class));
			response.setFlash(I18n.get(IExceptionMessage.QUERIE_3));
		}
		catch (Exception e) { TraceBackService.trace(response, e); }
	}

}
