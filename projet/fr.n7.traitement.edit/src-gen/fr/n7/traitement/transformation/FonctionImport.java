package fr.n7.traitement.transformation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import fr.n7.tableur.transformation.Tableur;
import fr.n7.traitement.*;

public class FonctionImport {
	
	private static List<String> parseCommand(String[] args, String argToParse) {
		List<String> l = new LinkedList<String>();
		boolean read = false;
		for (int i = 0; i < args.length ; i++) {
			if (args[i].matches(argToParse)) read = true;
			if (read) {
				if (args[i].matches("(-.|--(.)+)")) break;
				l.add(args[i]);
			}
		}
		return l;
	}
	
	public static Fonction createFonction(TraitementFactory traitementFactory, String[] args)  {
		
		List<String> e = parseCommand(args, "-e|--entrees");
		List<String> s = parseCommand(args, "-s|--sorties");
		
		String name = args[0];
		String tableName = args[1];
		
		Fonction fct = traitementFactory.createFonction();
		fct.setName(name);
		fct.setTableName(tableName);
		EList<String> ef = fct.getEntrees();
		EList<String> sf = fct.getSorties();
		
		for (String str : e) {
			fct.getEntrees().add(str);
		}
		
		for (String str : s) {
			fct.getSorties().add(str);
		}
		
		return fct;
		
		}
	
	public static void main(String[] args) {
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		TraitementPackage packageInstance = TraitementPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		// DÃ©finir la ressource (le modÃ¨le)
		URI modelURITarget = URI.createURI(Tableur.DIRECTORY_FONCTION + args[0]);
		Resource resourceTarget = resSet.createResource(modelURITarget);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de SimplePDL
	    TraitementFactory traitementFactory = TraitementFactory.eINSTANCE;

	    try {
	    	Fonction fct = createFonction(traitementFactory, args);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }

		// Sauver la ressource
	    try {
	    	resourceTarget.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
