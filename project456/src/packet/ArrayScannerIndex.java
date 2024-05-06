package packet;

import java.util.Scanner;

public class ArrayScannerIndex {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		String index[]= new  String [4];
		index[0]=s1.next();
		index[1]=s1.next();
		index[2]=s1.next();
		index[3]=s1.next();
		if(index.length==4)
		{   System.out.println("Display all index");
			for(int i=0; i<index.length;i++)
			{
				System.out.println(index[i]);
			}
		}
		else
		{
			System.out.println("Do not display index");
		}

	}
}
