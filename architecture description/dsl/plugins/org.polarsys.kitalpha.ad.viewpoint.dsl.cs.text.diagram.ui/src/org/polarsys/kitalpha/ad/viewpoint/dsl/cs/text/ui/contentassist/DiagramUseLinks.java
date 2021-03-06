/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Faycal Abka
 *
 */
public class DiagramUseLinks extends HashMap<String, Collection<String>> {

	private static final long serialVersionUID = 1L;


	public void put(final String kind, String uri){
		if (uri.startsWith("\"")) {
			uri = uri.substring(1);
		}

		if (uri.endsWith("\"")) {
			uri = uri.substring(0, uri.lastIndexOf("\""));
		}

		if (containsKey(kind)){
			get(kind).add(uri);
		} else {
			put(kind, new ArrayList<String>());
			get(kind).add(uri);
		}
	}


	@Override
	public Collection<String> get(final Object key){
		return super.get(key);
	}
}
