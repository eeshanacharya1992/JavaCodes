package packet;

import java.util.Scanner;

public class Sanjay123 {
	
   static void addition()
   {
	   Scanner m1= new Scanner(System.in); 
	   System.out.println("Hey enter first number for addition");
	   int a=             m1.nextInt();
	   System.out.println("Hey enter second number for addition");
	   int b=             m1.nextInt();
	   System.out.println("Hey enter the value of c");
	   int c= a+b;
	   System.out.println(c);
   }
   static void subtraction()
   {
	   Scanner m1= new Scanner(System.in);
	   System.out.println("Hey enter first number for subtraction");
	   int a=             m1.nextInt();
	   System.out.println("Hey enter second number for subtraction");
	   int b=             m1.nextInt();
	   System.out.println("Hey enter the value of c");
	   int c= a-b;
	   System.out.println("The value of subtraction is "+c);
   }
   static void multiplication()
   {
	   Scanner m1= new Scanner(System.in);
	   System.out.println("Hey enter first number for multiplication");
	   int a=             m1.nextInt();
	   System.out.println("Hey enter second number for multiplication");
	   int b=             m1.nextInt();
	   System.out.println("Hey enter the value of c");
	   int c= a*b;
	   System.out.println("The value of c is "+c);
   }
   static void division()
   {
	   Scanner m1= new Scanner(System.in);
	   System.out.println("Hey enter first number for division");
	   float a=             m1.nextInt();
	   System.out.println("Hey enter second number for division");
	   float b=             m1.nextInt();
	   System.out.println("Hey enter the value of c");
	  float c= a/b;
	   System.out.println("The value of c is "+c);
   }
	public static void main(String[] args) {
		
		 addition();
		 subtraction();
		 multiplication();
		 division();
		
	}

}
