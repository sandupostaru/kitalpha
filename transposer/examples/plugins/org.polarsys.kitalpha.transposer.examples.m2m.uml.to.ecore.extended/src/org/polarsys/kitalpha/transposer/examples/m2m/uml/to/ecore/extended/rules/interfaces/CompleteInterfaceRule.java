package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.extended.rules.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Property;


import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.util.ValueHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;



public class CompleteInterfaceRule extends AbstractGenericRule<Interface> {
	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#create(java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected Object create(Interface element_p, IContext context_p)
			throws Exception {

		// create the ECore EClass
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		
		// updates its structural attributes
		//set its name
		eClass.setName(element_p.getName());
		
		//set isAbstract Attribute
		eClass.setAbstract(element_p.isAbstract());
		
		//set the isInterface attribute
		eClass.setInterface(true);

		// Creates its EAttributes
		for (Property property : element_p.getAllAttributes())
			createAttributes(eClass, property, context_p);

		// set containment
		setContainment(element_p, eClass, context_p);
		
		return eClass;
	}

	/**
	 * Set the containment reference
	 * 
	 * @param element_p :
	 *            UML Class
	 * 
	 * @param eClass_p :
	 *            ECore EClass
	 * 
	 * @param context_p :
	 *            current context
	 */
	private void setContainment(Interface element_p, EClass eClass_p,
			IContext context_p) {
		
		//get its container transformed
		Object container_obj = ContextHelper.getMainTarget(context_p, element_p
				.eContainer());
		
		EPackage container = (EPackage)container_obj;
		
		//add the new EClass in its container(EPackage)
		container.getEClassifiers().add(eClass_p);
	}

	/**
	 * Creates and sets EClass attributes
	 * 
	 * @param class_p :
	 *            ECore Object
	 * @param property_p :
	 *            UML property
	 * @param context_p :
	 *            current context
	 */
	private void createAttributes(EClass class_p, Property property_p,
			IContext context_p) {
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		att.setName(property_p.getName());
		ValueHelper.setType(att, property_p, context_p);
		class_p.getEAttributes().add(att);

	}

	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule#update(java.lang.Object,
	 *      java.lang.Object,
	 *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
	 */
	@Override
	protected void update(Object object_p, Interface element_p,
			IContext context_p) throws Exception {
		
		EClass eClass = (EClass)object_p;
		
		//Update name
		eClass.setName(element_p.getName());

	}

	/**
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule#getPremises(java.lang.Object)
	 */
	public List<IPremise> getPremises(Interface element_p) {
		List<IPremise> premises = new ArrayList<IPremise>();
		 IPremise premise = null;
		 
			// its container have to created before itself
			Object value = element_p.getOwner();
			if(null != value){
				premise = createContainmentPremise(value);
				premises.add(premise);
			}
			return premises;
	}
}
