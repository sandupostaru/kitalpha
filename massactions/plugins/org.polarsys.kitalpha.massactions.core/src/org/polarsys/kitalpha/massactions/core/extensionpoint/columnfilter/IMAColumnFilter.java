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
package org.polarsys.kitalpha.massactions.core.extensionpoint.columnfilter;

import java.util.List;

import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensions.columnfilter.AbstractMAColumnFilter;

/**
 * Interface for implementing a column filter in order to contribute to the
 * existing default column filters. You should avoid implementing this interface
 * directly and instead extends the {@link AbstractMAColumnFilter} class
 * instead.
 * 
 * @author Sandu Postaru
 * 
 */
public interface IMAColumnFilter {

	/**
	 * Returns true if the current column should be hidden and false otherwise.
	 * 
	 * @param column
	 *            the current column
	 * @return true if the current column should be hidden and false otherwise
	 */
	boolean shouldHide(IMAColumn column);

	void setBaseColumns(List<IMAColumn> baseColumns);

	void setDisplayName(String displayName);

	String getDisplayName();
}
