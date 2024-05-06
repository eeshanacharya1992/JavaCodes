package packet;


abstract class Rohit
{
	abstract void add();
	abstract void sub();
}
public class Asif extends Rohit
{

	public static void main(String[] args) 
	{
		Asif m1= new Asif();
		m1.add();
		m1.sub();
	}

	void add() 
	{
		
		System.out.println("I am Rohit");
	}
	
	void sub() 
	{
		System.out.println("I am Asif");
	}
}
