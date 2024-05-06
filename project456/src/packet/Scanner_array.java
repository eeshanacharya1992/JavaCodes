package packet;

import java.util.Scanner;

public class Scanner_array {

	public static void main(String[] args) {
		  Scanner m1= new Scanner(System.in); 
		  System.out.println("Hey enter two arrays");
		   String name[]= new String[2];
		    name[0]= m1.next();
		    name[1]= m1.next();
		    if(name[0].equals(name[1]))
		    {
		    	System.out.println("It is equal");
		    	
		    }
		    else
		    {
		    	System.out.println("Not equal");
		    }
		    
	}

}
