package packages;

public class EeshanMethods 
{
	EeshanMethods()
	{
		System.out.println("I am Constructor");
	}
	static
	{
		System.out.println(" I am SIB");
	}
	static
	{
		System.out.println(" I am SIB123");
	}
	{
		System.out.println("I am IIB");
	}
	{
		System.out.println("I am IIB123");
	}
	static void Eeshan()
	{
		System.out.println("I am static method");
	}
	static void Acharya()
	{
		System.out.println("I am static method123");
	}
	void Deba()
	{
		System.out.println("I am nonstatic method");
	}
	void Prakash()
	{
		System.out.println("I am nonstatic method123");
	}
	public static void main(String[] args) 
	{
		Eeshan();
		Acharya();
		System.out.println("I am main method");
		EeshanMethods m1= new EeshanMethods();
		   m1.Deba();
		   m1.Prakash();
	}

}
