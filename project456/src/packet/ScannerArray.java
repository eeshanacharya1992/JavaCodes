package packet;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		int number[] = new int[4];
		Scanner s1= new Scanner(System.in);
	 // 	 number[0]= s1.nextInt();
	  	for(int i=0;i<number.length;i++)
	  	{  	number[i]= s1.nextInt();
	  		//System.out.println(Arrays.toString(number));
	  	}
	  	System.out.println(Arrays.toString(number));
	}

}
