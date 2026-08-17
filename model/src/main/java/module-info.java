import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.governance.capability.GovernanceArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.governance.capability.GovernanceEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.governance.capability.GovernanceResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.governance.capability.GovernanceResourceFactoryCapabilityFactory;

module org.nasdanika.models.governance.Governance {
	
	exports org.nasdanika.models.governance;
	exports org.nasdanika.models.governance.impl;
	exports org.nasdanika.models.governance.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
		
	provides CapabilityFactory with 
		GovernanceEPackageResourceSetCapabilityFactory,
		GovernanceResourceFactoryCapabilityFactory,
		GovernanceResourceContentsHandlerCapabilityFactory,
		GovernanceArrayResourceContentsHandlerCapabilityFactory;
	
}