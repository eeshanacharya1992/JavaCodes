package packet;
abstract class brake1{
	abstract void clutch1();
	abstract void clutch2();
	void clutch3()
	{
		System.out.println("I am clutch3");
	}
}
abstract class brake2 extends brake1{
	abstract void clutch4();
	abstract void clutch5();
	static void clutch6()
	{
		System.out.println("I am clutch6");
	}
	void clutch7()
	{
		System.out.println("I am clutch7");
	}
}
public class Carborator2 extends brake2
{

	public static void main(String[] args) {
		
		Carborator2 c1= new Carborator2();
		c1.clutch1();
		c1.clutch2();
		c1.clutch3();
		c1.clutch4();
		c1.clutch5();
		clutch6();
		c1.clutch7();

	}

	
	void clutch4() {
		
		System.out.println("I am clutch4");
	}

	
	void clutch5() {
		
		System.out.println("I am clutch5");
	}

	
	void clutch1() {
		
		System.out.println("I am clutch1");
	}

	
	void clutch2() {
		
		System.out.println("I am clutch2");
	}

}
