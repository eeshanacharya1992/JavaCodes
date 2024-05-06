package Practice;

import java.util.Scanner;

public class NumberDivisible {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a number");
		int number=s1.nextInt();
		s1.close();
		if(number%2==0 &&number%3==0)
		{
			System.out.println("The number is divisible by 2 and 3");
		}
		else
		{
			System.out.println("The number is not divisible by 2 and 3");
		}
	}

}
