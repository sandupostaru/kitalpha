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
package org.polarsys.kitalpha.massactions.core.painter.cell;

import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.swt.graphics.Image;

/**
 * The default cell painter for a group by object.
 * @author Sandu Postaru 
 *
 */
public class GroupByObjectCellPainter extends LabelImagePainter {

	@Override
	protected Image getImage(ILayerCell cell, IConfigRegistry configRegistry) {

		// we only want to display the image in the first column
		// the one that contains the group by selector
		if (cell.getColumnPosition() == 1) {
			return super.getImage(cell, configRegistry);
		}

		return null;
	}
}
