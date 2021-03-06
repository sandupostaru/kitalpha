/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.common.ui.preference;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Boubekeur Zendagui
 */
public class KitalphaPreferencePage extends GenericPreferencePage {

	/**
	 * Default constructor
	 */
	public KitalphaPreferencePage() {
		super();
		Map<String, String> linksData = new HashMap<String, String>();
		linksData.put("org.polarsys.kitalpha.ad.preference.category", PreferencesUIMsg.CATEGORY_PAGE_LABEL_AD);
		linksData.put("org.polarsys.kitalpha.mdecore.preference.category", PreferencesUIMsg.CATEGORY_PAGE_LABEL_MDECORE);
		setLinksData(linksData);
	}
}
