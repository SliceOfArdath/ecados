package fr.n7.tableur.transformation;

import fr.n7.tableur.transformation.CustomExceptions.*;

import java.time.temporal.TemporalAccessor;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import fr.n7.tableur.Primitive;

public class UniversalConverter implements Converter<Object>{

	@Override
	public List<Object> convert(List<String> column, Primitive p) throws WrongFormatException {
		
		switch (p) {
			case STRING:
				for(int i =0; i< column.size(); i++) {
					String s = column.get(i).trim();
					column.add(i, s);
					
				}
				return map(column);
			case DATE:
			case DATE_TIME:
				DateConverter dcv = new DateConverter();
				List<TemporalAccessor> temp = dcv.convert(column, p);
				return map(temp);
			case INT:
			case FLOAT:
				NumberConverter ncv = new NumberConverter();
				List<Number> num = ncv.convert(column, p);
				return map(num);
			default:
				return null;
		}
	}
	
	private <E extends Object> List<Object> map(List<E> list) {
		List<Object> lo = new LinkedList<Object>();
		for (E e : list) {
			lo.add(e);
		}
		return lo;
	}
	
	public List<String> convertString(List<Object> list) {
		List<String> l = new LinkedList<String>();
		for (Object o : list) {
			l.add(o.toString());
		}
		return l;
	}
	
	public Map<String, List<String>> convertGlobalString(Map<String, List<Object>> map) {
		Map<String, List<String>> mapString = new Hashtable<String, List<String>>();
		for (String s : map.keySet()) {
			mapString.put(s, convertString(map.get(s)));
		}
		return mapString;
	}
	
}
