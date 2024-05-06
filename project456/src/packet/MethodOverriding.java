
package packet;
class Parent
{
	void add()
	{
		System.out.println("One");
	}
}

public class MethodOverriding extends Parent
{
	void add()
	{
		System.out.println("Two");
		
		super.add();
	}
	public static void main(String[] args) 
	{
		MethodOverriding m1=new MethodOverriding();
		m1.add();

	}

}
