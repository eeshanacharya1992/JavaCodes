package Practice;

import java.util.Scanner;

public class ScannerClass
{
	static void add()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = S1.nextInt();
		System.out.println("Enter the Second Number");
		int b = S1.nextInt();
		int sum = a+b;
		System.out.println("The Addition of two number's are:"  +sum);
		String a1= S1.next();
		System.out.println(a1);
		
		
	}
	static void sub()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a = S1.nextInt();
		System.out.println("Enter the Second Number:");
		int b = S1.nextInt();
		int sub = a - b;
		System.out.println("The Subtraction of two Numbers is:" +sub);
				
	}
	static void mul()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a = S1.nextInt();
		System.out.println("Enter the Second Number:");
		int b = S1.nextInt();
		int mul = a * b;
		System.out.println("The Multiplication of two Numbers is:" +mul);
				
	}
	static void div()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		double a = S1.nextDouble();
		System.out.println("Enter the Second Number:");
		double b = S1.nextDouble();
		double div = a / b;
		System.out.println("The Division of two Numbers is:" +div);
		S1.close();		
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	  
	}

}
