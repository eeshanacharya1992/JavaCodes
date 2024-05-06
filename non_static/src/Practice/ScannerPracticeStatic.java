package Practice;

import java.util.Scanner;

public class ScannerPracticeStatic {
	Scanner s1= new Scanner(System.in);
    int a= s1.nextInt();
  int b= s1.nextInt();
 
   static void add()
    {   ScannerPracticeStatic a1= new ScannerPracticeStatic();
  	  int c=a1.a+a1.b;
  	  System.out.println("The sum of a and b is " +c);
    }
   static void subtract()
    { ScannerPracticeStatic a1= new ScannerPracticeStatic();
  	  int d= a1.a-a1.b;
  	  System.out.println("The difference of a and b is " +d);
    }
   static void multiply()
    {  ScannerPracticeStatic a1= new ScannerPracticeStatic();

  	  int e= a1.a*a1.b;
  	  System.out.println("The product of a and b is " +e);
    }
   static void divide()
    {  ScannerPracticeStatic a1= new ScannerPracticeStatic();

   	 int f=a1.a/a1.b;
   	 System.out.println("The division result of a and b is "+f);
    }
	public static void main(String[] args) {
	
		
	}

}
