package packet;

class bablu
{
	void add()
	{
		System.out.println("Om");
	}
}
public class MethodOverriding22 extends bablu
{ 
	void add()
	{
		System.out.println("Shanti");
		super.add();
	}

	public static void main(String[] args) 
	{
		MethodOverriding22 m1= new MethodOverriding22();
		m1.add();

	}

}
