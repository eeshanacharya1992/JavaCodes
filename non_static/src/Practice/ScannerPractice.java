package Practice;

import java.util.Scanner;

public class ScannerPractice {
	 Scanner s1= new Scanner(System.in);
     int a= s1.nextInt();
   int b= s1.nextInt();
     void add()
     {
   	  int c=a+b;
   	  System.out.println("The sum of a and b is " +c);
     }
     void subtract()
     {
   	  int d= a-b;
   	  System.out.println("The difference of a and b is " +d);
     }
     void multiply()
     {
   	  int e= a*b;
   	  System.out.println("The product of a and b is " +e);
     }
     void divide()
     {
    	 int f=a/b;
    	 System.out.println("The division result of a and b is "+f);
     }
	public static void main(String[] args) {
		ScannerPractice a2= new ScannerPractice();
		a2.add();
		a2.subtract();
		a2.multiply();
		a2.divide();
	}

}
