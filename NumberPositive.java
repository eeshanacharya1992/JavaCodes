package Condition;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NumberPositive {

	public static void main(String[] args) {
		int num []=new int[1];
		   System.out.println("Enter the Input value ");
		    Scanner sc=new Scanner(System.in);
		   for(int i=0;i<1;i++)
		  {    
		       num[i]=sc.nextInt();
		  }
		  System.out.println(Arrays.toString(num));
		 int a[]= {-12};
		  boolean c= Arrays.equals(num, a);
				  if(c==true)
		{
		   System.out.println("The given input is Negative number : " +num);
		}
		else{
		  System.out.println("The given input is Positive Number : " +num);

		 }
		
	}

	

}
