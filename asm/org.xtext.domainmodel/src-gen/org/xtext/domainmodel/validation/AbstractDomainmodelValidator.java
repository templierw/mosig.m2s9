/*
 * generated by Xtext 2.25.0
 */
package org.xtext.domainmodel.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDomainmodelValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.domainmodel.domainmodel.DomainmodelPackage.eINSTANCE);
		return result;
	}
}
