package conditional1;

import java.util.Scanner;

public class Ramos {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		if(a>=s1.nextInt())
		{
			System.out.println("The value of a is"+a);
		}
		else if(b>s1.nextInt())
		{
			System.out.println("Simple minded");	
		}
		else
		{
			System.out.println("The value of b is"+b);
		}
	}

}
