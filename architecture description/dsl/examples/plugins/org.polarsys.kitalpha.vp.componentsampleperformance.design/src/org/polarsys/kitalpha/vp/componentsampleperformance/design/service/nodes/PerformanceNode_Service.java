
// Generated on 26.10.2015 at 04:10:35 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsampleperformance.design.service.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.kitalpha.vp.componentsampleperformance.design.service.nodes.PerformanceNode_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class PerformanceNode_Service {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject : the current semantic object
	* @param view : the current view
	* @param container : the semantic container of the current object
	* @generated NOT
	*/
	public boolean WhenTooComplex(EObject eObject, EObject view, EObject container) {
		Performance perf = (Performance) eObject;
		return (perf.getComplexity() > 2);
	}
}