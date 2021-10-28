package principale;
import java.io.*;
import java.util.Scanner;

public class MainReadfile {
	
	
public static void main(String[]args) throws IOException {
	
	
	
	
String  filename="./baz.txt";

Scanner scan=new Scanner(new File(filename));
	
	
	while(scan.hasNextLine()) {
		
		
		
		String line=scan.nextLine();
		
		System.out.println(line);
		
		
		
		
		
		
		
		
		
		
	}
	
	

	
}	
	
	
	
}
	
	
	
	
	


