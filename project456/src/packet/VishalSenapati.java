package packet;

import java.util.Scanner;

public class VishalSenapati {
	static int a,b;
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
		   System.out.println(c);
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
		   System.out.println(c);
	   }
	   static void division()
	   {
		   Scanner m1= new Scanner(System.in);
		   System.out.println("Hey enter first number for division");
		 int a=             m1.nextInt();
		   System.out.println("Hey enter second number for division");
		int b=             m1.nextInt();
		   System.out.println("Hey enter the value of c");
		int  c=  (a/b);
		   System.out.println(c);
		
	   }
	public static void main(String[] args) {
		 addition();
		 subtraction();
		 multiplication();
		 division();

	}

}
