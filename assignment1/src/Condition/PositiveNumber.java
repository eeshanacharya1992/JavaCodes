package Condition;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner m1= new Scanner(System.in);
	System.out.println("Enter a number");
		int a= m1.nextInt();
		if(a>=0)
		{
			System.out.println("The positive number is "+a);
		}
		else
		{
			System.out.println("The negative number is"+a);
		}
	}

}
