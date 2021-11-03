package principale;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;


public class Principefileread  {
	
	
	public static void main(String[] args) throws FileNotFoundException {

        String line = "";
        final String delimiter = ";";
        ArrayList<Employe> list=new ArrayList<Employe>();
        try
        {
            String filePath = "./employeesadv.csv";
            FileReader fileReader = new FileReader(filePath);

            BufferedReader reader = new BufferedReader(fileReader);
            String filename="baz.txt";
       	 FileWriter  fs=new FileWriter(filename,false);
            String str = null;
            int i=0;
       	 while((str = reader.readLine()) != null)             
            {
               //fs.write(str);
               //fs.write("\n");
              // fs.flush();
               String[] token = str.split(delimiter);    // separate every token by comma
               
   			System.out.println(" | "+token[i] + " | ");
   			
   		
   			
   		Employe e=new Employe(token[0],token[1],token[2],token[3],token[4],token[5],token[6]);
   		list.add(e);
   		
            }
             
            
            Collections.sort(list, Comparator.comparing(Employe::getNumero));
         for(Employe element:list) {
        	 
        	fs.write(element.getId()+" | "+element.getNumero()+" | "+element.getNom()+" | "+element.getPrenom()+" | "+element.getNom_fonction()+" | "+element.getDateEmbauche()+" | "+
        	 
        	 " "+element.getNom_service()+" | ");
        	fs.write("\n -------------------- \n");
        	fs.flush();
        	
        	System.out.println(element.getNom());
         }
         
         String json = new Gson().toJson(list ).replace("},","},\n");
         fs.write(json);
         fs.flush();
         fs.close();
        // Employe[] array = new Employe[list.size()];
        // for(int i1 = 0; i1 < list.size(); i1++) {
          //   array[i1] = list.get(i1);
             
        // }
            // array.toString();
             
        	
        	
        	// fs.write(array.toString());
        	// fs.close();
        	 
        	 
        	 
         
            
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

	        
	}}
