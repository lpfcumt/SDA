package cn.Guitars.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.Guitars.model.Guitar;
import cn.Guitars.model.GuitarSpec;

@Component("inventory")
public class Inventory {

	public List<Guitar> search(GuitarSpec searchSpec,List<Guitar> guitars) { 
		List<Guitar> matchingGuitars = new LinkedList<Guitar>(); 
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) { 
			Guitar guitar = i.next();
			if(guitar.getSpec().matches(searchSpec)){
				matchingGuitars.add(guitar);
			}
			 
		} 
		return matchingGuitars; 
	}
}
