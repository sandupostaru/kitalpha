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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.naming;

import java.util.List;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class DataQualifiedNameConverter implements IQualifiedNameConverter{

	public static String ECORE_PREFIX = "ecore";
	
	@Override
	public String toString(QualifiedName qualifiedName) {
		if (qualifiedName == null) {
			throw new IllegalArgumentException("Qualified name cannot be null");
		}
		return qualifiedName.toString(getDelimiter());
	}

	@Override
	public QualifiedName toQualifiedName(String qualifiedNameAsString) {
		if (qualifiedNameAsString == null) {
			throw new IllegalArgumentException("Qualified name cannot be null");
		}
		if (qualifiedNameAsString.equals("")) {
			throw new IllegalArgumentException("Qualified name cannot be empty");
		}
		if (Strings.isEmpty(getDelimiter())) {
			return QualifiedName.create(qualifiedNameAsString);
		}
		List<String> segs = getDelimiter().length() == 1 ? Strings.split(qualifiedNameAsString, getDelimiter()
				.charAt(0)) : Strings.split(qualifiedNameAsString, getDelimiter());
		if (segs.size()>=2 && segs.get(0).equals(ECORE_PREFIX)) {
			QualifiedName.create(segs.remove(0));
		}
	    return QualifiedName.create(segs);
	}
	
	public String getDelimiter() {
		return ".";
	}

}
