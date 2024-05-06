package packet;
abstract class part1{
	abstract void gear1();
	static void gear2()
	{
		System.out.println("I am gear2");
	}
	void gear3()
	{
		System.out.println("I am gear3");
	}
}
abstract class part2 extends part1{
	abstract void gear4();
	static void gear5()
	{
		System.out.println("I am gear5");
	}
	void gear6()
	{
		System.out.println("I am gear6");
	}
}
public class Carborator3 extends part2 {
    static void gear7()
    {
    	System.out.println("I am gear7");
    }
    void gear8()
    {
    	System.out.println("I am gear8");
    }
	public static void main(String[] args) {
		Carborator3 c2= new Carborator3();
		c2.gear1();
		gear2();
		c2.gear3();
		c2.gear4();
		gear5();
		c2.gear6();
		gear7();
		c2.gear8();
	}
	
	void gear4() {
		
		System.out.println("I am gear4");
	}
	
	void gear1() {
		System.out.println("I am gear1");
	}

}
