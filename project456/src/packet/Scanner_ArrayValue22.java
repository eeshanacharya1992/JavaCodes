package packet;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Scanner_ArrayValue22 {

	public static void main(String[] args) {
		  int value[]= new int[10];
		  Scanner m1= new Scanner(System.in); 
		  for(int i=0;i<10;i++)
		  {
			 value[i]=m1.nextInt();
		//	  System.out.println(value[i]);
		  }
	System.out.println(Array.getInt(value, 0));
	}

	}


