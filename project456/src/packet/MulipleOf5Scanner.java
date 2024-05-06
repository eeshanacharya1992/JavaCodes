package packet;

import java.util.Scanner;

public class MulipleOf5Scanner {

	public static void main(String[] args) {
		Scanner m1=new Scanner(System.in);
		int number=m1.nextInt();
		for( number=5;number<100; number++)
		{
			if(number%5==0)
			{
			  System.out.println(number);
				
			}
	}

	}}
