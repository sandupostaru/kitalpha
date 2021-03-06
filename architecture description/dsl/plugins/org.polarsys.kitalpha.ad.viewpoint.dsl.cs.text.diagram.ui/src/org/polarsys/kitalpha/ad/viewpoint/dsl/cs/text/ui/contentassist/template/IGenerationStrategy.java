/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;

/**
 *
 * This interface aims to have diffrents diagram generation
 *
 * @author Faycal Abka
 *
 */
public interface IGenerationStrategy {

	String SEPARATOR = ".";
	String LINE_SEPARATOR = "\n";
	String INDENTATION = "	";

	/**
	 * Algorithm of generation
	 * @param vpClass
	 * @param TreeAppendable
	 */
	TreeAppendable generateDiagram(Class vpClass);
}
