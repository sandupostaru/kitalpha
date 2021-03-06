/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;

import junit.framework.TestCase;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class ModelTests extends TestCase {

	protected ResourceSet set;
	protected ViewpointMetadata helper;
	private String modelPath;
	
	public ModelTests(String modelPath) {
		super();
		this.modelPath = modelPath;
	}

	@Override
	protected void setUp() throws Exception {
		set = new ResourceSetImpl();  
		URI uri = URI.createPlatformPluginURI(modelPath, true);
		set.getResource(uri, true);
		helper = MetadataHelper.getViewpointMetadata(set);
		helper.initMetadataStorage();
	}

	@Override
	protected void tearDown() throws Exception {
		for (Resource r : set.getResources())
			r.unload();
		set.getResources().clear();
	}

}