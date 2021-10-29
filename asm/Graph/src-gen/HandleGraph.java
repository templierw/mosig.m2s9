import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import graph.Graph;
import graph.GraphFactory;
import graph.GraphPackage;
import graph.Node;


public class HandleGraph {

	public static void main(String[] args) {
		// Initialize the model
		GraphPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .graphe extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE ;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("graph", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Get the resource
		Resource res = resSet.getResource(URI.createURI("MyModel1.graph"), true);
		// Get the first model element and cast it to the right type
		Graph myGraph = (Graph)res.getContents().get(0);
		
		GraphFactory factory = GraphFactory.eINSTANCE ;
		Node n3 = factory.createNode();
		n3.setName("N3");
		myGraph.getTheNodes().add(n3);
		try {
			res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(myGraph.Validate()){
			System.out.println("Your Graph is Valid.");
		}else{
			System.out.println("Your Graph is NOT Valid.");
		}

	}

}
