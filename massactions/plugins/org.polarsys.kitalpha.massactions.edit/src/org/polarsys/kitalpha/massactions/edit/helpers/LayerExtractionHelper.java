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
package org.polarsys.kitalpha.massactions.edit.helpers;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;

/**
 * A layer extraction helper, providing some utility methods.
 */
public class LayerExtractionHelper {

  private LayerExtractionHelper() {
    // Exists only to defeat instantiation.
  }

  public static IMABodyLayer extractBodyLayer(NatTable natTable) {

    ILayer baseLayer = natTable.getLayer();
    if (baseLayer instanceof IMAGridLayer) {
      return ((IMAGridLayer) baseLayer).getBodyLayer();
    }

    throw new IllegalArgumentException(baseLayer.getClass().toString());

  }

}
