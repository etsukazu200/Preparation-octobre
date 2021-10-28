package principale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principale3 {
	
	
	public static void main (String[]arg) {
		
		
		HashMap<String,Integer> voiture=new HashMap<String,Integer>();
		
		
		
		voiture.put("Mercedes", 160);
		voiture.put("ford fiesta", 140);
		voiture.put("range rover", 180);
		
		for(Entry<String, Integer> indice: voiture.entrySet()) {
			System.out.println(indice.getKey()+ " "+indice.getValue());
			
			
		}
		
		for( String i:voiture.keySet()) {
			
			
			System.out.println(voiture.get(i));
			}
		
		voiture.forEach((Key,Value)->{
			
			System.out.println(Key+" "+Value);
			
			
		});
			
		
		
		Comparator<Entry<String,Integer>> compteurvoiture=new Comparator<Entry<String,Integer>>()
				{

					@Override
					public int compare(Entry<String, Integer> v1, Entry<String, Integer> v2) {
						
						return v1.getValue() - v2.getValue();
					}
			
			
			
				};
		
				Set<Entry<String, Integer>> entriesvoiture = voiture.entrySet();
		List<Entry<String,Integer>> listVoiture=new ArrayList<Entry<String, Integer>>(entriesvoiture);
		Collections.sort(listVoiture, compteurvoiture);
		LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>( listVoiture.size());
		
		for(Entry<String, Integer> element : listVoiture)
		{ sortedByValue.put(element.getKey(), element.getValue()); }

		System.out.println("HashMap after sorting entries by values "); 
		
		Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
		
		for(Entry<String, Integer> mapping : entrySetSortedByValue){ System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); }

		
				
			
			
		}
		
				
			
		
	}


