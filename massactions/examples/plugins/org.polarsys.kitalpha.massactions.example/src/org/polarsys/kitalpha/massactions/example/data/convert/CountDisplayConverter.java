/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.example.data.convert;

import org.polarsys.kitalpha.massactions.core.data.convert.MADisplayConverter;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class CountDisplayConverter extends MADisplayConverter {

	@Override
	public String canonicalToDisplayValue(Object canonicalValue) {
		return String.valueOf(canonicalValue);
	}
}
