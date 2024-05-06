package Practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the year");
		int year= s1.nextInt();
		if(year%4==0)
		{
			System.out.println("The leap year is "+year);
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
