package fr.n7.tableur.transformation;

import java.util.LinkedList;
import java.util.List;
import fr.n7.tableur.transformation.CustomExceptions.*;

import fr.n7.tableur.Primitive;

public class NumberConverter implements Converter <Number>{
	
	@Override
	public  List<Number> convert(List<String> column, Primitive p) throws WrongFormatException {
		 List<Number> converted = new LinkedList<Number>();
		for (String s : column) {
			switch (p) {
			case INT :
				converted.add(callCommand(new converterInt(), s));
			break;
			case FLOAT:
				converted.add(callCommand(new converterFloat(), s));
				break;
			default:
				throw new WrongFormatException("conversion en nombre.");
			}
		}
		return converted;
	}
	
	

	private interface Command {
		
		public Number execute(String data) throws WrongFormatException;
		
	}
	
	private static class converterInt implements Command {
		
		@Override
		public Integer execute(String data)  throws WrongFormatException
	        {
				try {
					return Integer.parseInt(data);
				}
				catch(NumberFormatException e) {
					throw new WrongFormatException("convertion d'une colonne en Int.");
				}
	        }    
	}
	
	private static class converterFloat implements Command {
		
		@Override
		public Float execute(String data)  throws WrongFormatException
	        {
				try {
					return Float.parseFloat(data);
				}
				catch(NumberFormatException e) {
					throw new WrongFormatException("convertion d'une colonne en float.");
				}
	        }    
	}

 	private static Number callCommand(Command command, String data) throws WrongFormatException{
        return command.execute(data);
    }
}
