package principale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaractereUpLow {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		char char1='A';
		char char2='b';
		
		
		char char1Lowercase=Character.toLowerCase(char1);
		char char2Upper=Character.toUpperCase(char2);
		
		
		System.out.println(char2+" en majiscule est "+char2Upper);
		System.out.println(char1+" en miniscule est "+char1Lowercase);
		
		
		String sentence=" This Is My Room";
		
		StringBuilder newString=new StringBuilder(sentence);
		
		newString.setCharAt(10, 'a');
		System.out.println(newString);
		
		
		
		StringBuffer mysentence=new StringBuffer("Hello Word This Me Fatim");
		
		System.out.println(" la phrase original"+mysentence);
		
		mysentence.replace(6,7 , "Y");
		System.out.println(" la nouvelle phrase est "+mysentence);
		
		
		
		String word1="Hello";
		
		String word2="hello";
		
		int result=word1.compareTo(word2);
		if(result<0) 
		System.out.println("wod1 et inferriere à word2");
		else if (result>0) {
			System.out.println("wod1 et superriere à word2");
		}
	  else
				System.out.println("wod1 et word2 sont egaux");
		
		
		int resultat=word1.compareToIgnoreCase(word2);
				if(resultat<0) 
					System.out.println("wod1 et inferriere à word2");
					else if (resultat>0) {
						System.out.println("wod1 et superriere à word2");
					}
				  else
							System.out.println("wod1 et word2 sont egaux");
		
		
				
				
				
			String phrase="Hello My frined I'm At Homme";
			
			char chare = phrase.charAt(1);
			  
			  System.out.println("le charactere à la position 1 r est "+chare);
				
			 int longueur=phrase.length();
			 
			System.out.println("la logueur est "+longueur);
			
			String jomla=" Hi i'm not disponible ";
			
			String[] stringtable=jomla.split("",8);
			
			for(int i=0;i<stringtable.length;i++) {
				
				System.out.println("element  "+stringtable[i]);
				
				
				
			}
			
			List<String> listchaine=new ArrayList<String>(Arrays.asList(stringtable));
			
			System.out.println("After conversion from array to list: " + listchaine);
			listchaine.add("Hey 'im here");
			
			for(String list:listchaine) {
				System.out.println("After conversion from array to list: " + list);
				
			}
			System.out.println("After conversion from array to list: " + listchaine);
	}   
	
	
	
	
	
	
	
	}
	

	
	
	
	
	

	
	
	


