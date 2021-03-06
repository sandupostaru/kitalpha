/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.task;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.EMFDomain;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;


public class StringBuilderTask implements ITaskProduction {

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		String outputFolder = productionContext.getInputValue("outputFolder",
				String.class);
		EMFDomain domain = productionContext.getInputValue("domain",
				EMFDomain.class);
		String modelName = DocGenHtmlUtil.getModelName(domain);
		IPath path = new Path(outputFolder).append(modelName);
		productionContext.setOutputValue("htmlOutputFolder", path.toString());
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need fot this step
	}

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need fot this step
	}

}
