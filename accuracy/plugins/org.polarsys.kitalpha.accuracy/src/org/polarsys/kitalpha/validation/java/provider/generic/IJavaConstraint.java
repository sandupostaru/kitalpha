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
package org.polarsys.kitalpha.validation.java.provider.generic;

import org.eclipse.emf.ecore.EObject;

/**
 * A java constraint.
 * 
 * @author Yann Mortier
 */
public interface IJavaConstraint<T extends EObject> {

    /**
     * Returns <code>true</code> if the given object is valid, otherwise
     * returns false otherwise.
     * 
     * @param object
     *            the object to validate.
     * @return true if the given object is valid, otherwise returns false.
     */
    boolean isValid(T object);

    /**
     * Returns the type of object to validate.
     * 
     * @return the type of object to validate.
     */
    Class<T> getTargetType();

}
