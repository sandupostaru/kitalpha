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
package org.polarsys.kitalpha.massactions.core.table;

import java.util.List;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.polarsys.kitalpha.massactions.core.config.IMAConfiguration;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnfilter.IMAColumnFilter;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;

/**
 * An interfaces specifying the available methods for a mass action table.
 * 
 * @author Sandu Postaru
 *
 */
public interface IMATable extends IMAComponent {

  void saveState();

  boolean isInitialized();

  boolean setFocus();

  // getters
  IMAGridLayer getGridLayerStack();

  NatTable getNatTable();

  IMAConfiguration getTableBaseConfig();
  
  // utility methods
  boolean commitAndCloseActiveCellEditor();

  public void clearSelection();

  void applyColumnFilter(IMAColumnFilter columnFilter);

  List<IMAColumnFilter> getColumnFilterList();
}
