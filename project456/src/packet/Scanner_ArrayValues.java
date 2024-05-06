package packet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Scanner_ArrayValues {

	public static void main(String[] args) {
		  Scanner m1= new Scanner(System.in); 
		  System.out.println("Hey enter array values");
		  int value[]= new int[10];
		 
		  for(int i=0;i<value.length;i++)
		  {
			 value[i]=m1.nextInt();
			//  System.out.println(value[i]);
			
		  }
	     System.out.println(Arrays.toString(value));
		

	}

}
