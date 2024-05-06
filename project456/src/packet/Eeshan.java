package packet;

import java.util.Scanner;

public class Eeshan {
	 Scanner m1= new Scanner(System.in); 
	int a= m1.nextInt();
    int b=  m1.nextInt();
    static void addition1()
    {  
    	Eeshan e1= new Eeshan();
 	   System.out.println(" first number for addition is :"+e1.a);
 	 
 	   System.out.println("second number for addition is :"+e1.b);
 	  
 	   System.out.println("Hey enter the value of c");
 	   int c= e1.a+e1.b;
 	   System.out.println(c);
    }
    static void subtraction1()
    {  
    	Eeshan e1= new Eeshan();
 	   System.out.println(" first number for subtraction is :"+e1.a);
 	  
 	   System.out.println("second number for addition is :"+e1.b);
 	  
 	   System.out.println("Hey enter the value of c");
 	   int c= e1.a-e1.b;
 	   System.out.println(c);
    }
    static void multiplication1()
    {
    	
    	Eeshan e1= new Eeshan();
  	   System.out.println(" first number for multiplication is :"+e1.a);
  	  
  	   System.out.println("second number for multiplication is :"+e1.b);
  	  
  	   System.out.println("Hey enter the value of c");
  	   int c= e1.a*e1.b;
  	   System.out.println(c);
    }
    static void division1()
    {   
	    Eeshan e1= new Eeshan();
  	   System.out.println(" first number for division is :"+e1.a);
  	  
  	   System.out.println("second number for division is :"+e1.b);
  	  
  	   System.out.println("Hey enter the value of c");
  	   int c= e1.a/e1.b;
  	   System.out.println(c);
    }
 	public static void main(String[] args) {
 		
 		addition1();
 		 subtraction1();
 		 multiplication1();
 		 division1();
 	}

}
