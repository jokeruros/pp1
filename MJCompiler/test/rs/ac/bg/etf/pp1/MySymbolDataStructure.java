package rs.ac.bg.etf.pp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.structure.SymbolDataStructure;

public class MySymbolDataStructure extends SymbolDataStructure {
	
	HashMap<String,Obj> symbols=new HashMap<String, Obj>();
	@Override
	public Obj searchKey(String key) {
		if(symbols.containsKey(key))
			return symbols.get(key);
		else return null;
	}

	@Override
	public boolean deleteKey(String key) {
		if(symbols.remove(key)!=null)return true;
		else
		return false;
	}

	@Override
	public boolean insertKey(Obj node) {
		String name=node.getName();
		if(symbols.containsKey(name))return false;
		if(symbols.put(name, node)!=null)return true;
		else
		return false;
	}

	@Override
	public Collection<Obj> symbols() {
		 Iterator iter = symbols.entrySet().iterator();
		 List<Obj> objects = new ArrayList<Obj>();
		 while(iter.hasNext()) {
			 Map.Entry mapElement = (Map.Entry)iter.next();
			 objects.add((Obj)mapElement.getValue());
		 }
	//	 Collections.shuffle(objects);
		return objects;
	}

	@Override
	public int numSymbols() {
		return symbols.size();
		
	}

}
