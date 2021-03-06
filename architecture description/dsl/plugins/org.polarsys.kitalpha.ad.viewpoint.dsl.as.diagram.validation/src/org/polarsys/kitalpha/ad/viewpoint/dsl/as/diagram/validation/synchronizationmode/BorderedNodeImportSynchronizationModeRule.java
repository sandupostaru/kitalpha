/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.synchronizationmode;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class BorderedNodeImportSynchronizationModeRule extends AbstractImportSynchronizationModeRule {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof BorderedNode && ((BorderedNode)object).getImports() != null;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		return getMessage("BorderedNode", object); //$NON-NLS-1$
	}

	@Override
	protected SynchronizationMode getSynchronizationMode(Object data) {
		return ((BorderedNode)data).getSynchronizationMode();
	}

	@Override
	protected boolean isCreateElement(Object data) {
		return ((BorderedNode)data).getImports().isCreateElements();
	}

	@Override
	protected boolean isSynchronizedLock(Object data) {
		return ((BorderedNode)data).getImports().isSynchronizationLock();
	}

}
