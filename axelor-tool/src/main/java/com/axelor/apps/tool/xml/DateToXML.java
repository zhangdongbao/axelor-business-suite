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
package com.axelor.apps.tool.xml;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DateToXML {

	private static final Logger LOG = LoggerFactory.getLogger(DateToXML.class);

	public static XMLGregorianCalendar convert(LocalDateTime in) {
		
		XMLGregorianCalendar date = null;
		
		try {
			
			date = DatatypeFactory.newInstance().newXMLGregorianCalendar(in.toString());
			
		} catch (DatatypeConfigurationException e) {
			
			LOG.error(e.getMessage());
			
		}
		
		return date;
	}
}
