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
package org.polarsys.kitalpha.emde.xmi;

import org.eclipse.emf.ecore.xmi.impl.XMILoadImpl;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Xavier Maysonnave
 * 
 */
public class XMIExtensionLoadImpl extends XMILoadImpl {

	/**
	 * Constructor for XMILoad.
	 */
	public XMIExtensionLoadImpl(XMIExtensionHelperImpl helper) {
		super(helper);
	}

	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new SAXExtensionXMIHandler(resource, helper, options);
	}

}
