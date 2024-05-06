package packages;

public class EeshanMethods12 
{
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
	static void Eeshan(int a, String b)
	{
		System.out.println("I am static method");
	}
	void Deba(int z, double c)
	{
		System.out.println("I am nonstatic method");
	}

	public static void main(String[] args) 
	{
		Eeshan(22,"Hi");
		System.out.println("I am main method");
        EeshanMethods12 m1= new EeshanMethods12();
        m1.Deba(22, 5.13);
        new EeshanMethods12();
	}

}
