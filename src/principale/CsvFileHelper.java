package principale;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileHelper  {

	
	

		public static List<String> readFile(File file) throws IOException {

	        List<String> result = new ArrayList<String>();

	        FileReader fr = new FileReader(file);
	        
	        
	        BufferedReader br = new BufferedReader(fr);

	        for (String line = br.readLine(); line != null; line = br.readLine()) {
	            result.add(line);
	        }

	        br.close();
	        fr.close();

	        return result;
	    }

    }
	
	
	
	
	
	

