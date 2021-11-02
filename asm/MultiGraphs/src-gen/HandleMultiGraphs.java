import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import multiGraphs.MultiGraphs;
import multiGraphs.MultiGraphsPackage;



public class HandleMultiGraphs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize the model
		MultiGraphsPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .graphe extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE ;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("multigraphs", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Get the resource
		Resource res = resSet.getResource(
				URI.createURI(
						"/home/william/mosig.m2s9/repo/runtime-EclipseApplication/test/test.multigraphs"
						), true
				);
		// Get the first model element and cast it to the right type
		MultiGraphs myGraph = (MultiGraphs)res.getContents().get(0);
		
		try {
			res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Your Graph is" + (myGraph.Valider()? "": "NOT")  + "Valid.");
		
		myGraph.Path("N1", "N5");

	}

}
