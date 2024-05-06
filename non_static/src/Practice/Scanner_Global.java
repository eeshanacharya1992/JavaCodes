package Practice;

import java.util.Scanner;

public class Scanner_Global {
	int a;
	int b;
	
	void add()
	{
		int sum=a+b;
		System.out.println("sum="+sum);
	}
    
	void sub()
	{
		int sub=a-b;
		System.out.println("sub="+sub);
	}
	
	void mul()
	{
		int mul=a*b;
		System.out.println("mul="+mul);
	}
	
	void div()
	{
		int div=a/b;
		System.out.println("div="+div);
	}
	
	void modulus()
	{
		int modulus=a%b;
		System.out.println("modulus="+modulus);
	}
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a & b");
	 
		Scanner_Global s2=new Scanner_Global();
		s2.a=s1.nextInt();
		  s2.b=s1.nextInt();
		s2.add();
		s2.sub();
		s2.mul();
		s2.div();
		s2.modulus();
		s1.close();
	}
}
