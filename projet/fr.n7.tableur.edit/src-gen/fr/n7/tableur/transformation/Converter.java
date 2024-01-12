package fr.n7.tableur.transformation;

import java.util.List;
import fr.n7.tableur.transformation.CustomExceptions.*;

import fr.n7.tableur.*;

public interface Converter<E> {
	
	public List<E> convert(List<String> column, Primitive p) throws WrongFormatException;
	
}
