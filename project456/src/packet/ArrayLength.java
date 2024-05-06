package packet;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int number[]= new  int [5];
		number[0]=s1.nextInt();
		number[1]=s1.nextInt();
		number[2]=s1.nextInt();
		number[3]=s1.nextInt();
		number[4]=s1.nextInt();
		for(int i=0; i<number.length;i++)
		{
			System.out.println(number[i]);
		
		}
      
	}

}
