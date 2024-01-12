package fr.n7.tableur.transformation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.LinkedList;
import java.util.List;

import fr.n7.tableur.Primitive;
import fr.n7.tableur.transformation.CustomExceptions.WrongFormatException;

public class DateConverter implements Converter<TemporalAccessor> {

	@Override
	public List<TemporalAccessor> convert(List<String> column, Primitive p) throws WrongFormatException {
		List<TemporalAccessor> converted = new LinkedList<TemporalAccessor>();
		for (String s : column) {
			switch (p) {
			case INT :
				converted.add(callCommand(new converterDate(), s));
			break;
			case FLOAT:
				converted.add(callCommand(new converterDateTime(), s));
				break;
			default:
				throw new WrongFormatException("conversion en date.");
			}
		}
		return converted;
	}
	
	

	private interface Command {
		
		public TemporalAccessor execute(String data) throws WrongFormatException;
		
	}
	
	private static class converterDate implements Command {
		
		@Override
		public LocalDate execute(String data)  throws WrongFormatException
	        {
				try {
					return LocalDate.parse(data);
				}
				catch(NumberFormatException e) {
					throw new WrongFormatException("convertion d'une colonne en LocalDate.");
				}
	        }    
	}
	
	private static class converterDateTime implements Command {
		
		@Override
		public LocalDateTime execute(String data)  throws WrongFormatException
	        {
				try {
					return LocalDateTime.parse(data);
				}
				catch(NumberFormatException e) {
					throw new WrongFormatException("convertion d'une colonne en LocalDateTime.");
				}
	        }    
	}

 	private static TemporalAccessor callCommand(Command command, String data) throws WrongFormatException{
        return command.execute(data);
    }
}
