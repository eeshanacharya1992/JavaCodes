package packet;
interface Biswajit{
	void method4();
}

abstract class Sunil implements Biswajit{
	abstract void method1();
	static void method2()
	{
		System.out.println("2");
	}
	void method3()
	{
		System.out.println("3");
	}
}
public class DifferentClasses extends Sunil {
    static void method5()
    {
    	System.out.println("5");
    }
    void method6()
    {
    	System.out.println("6");
    }
	public static void main(String[] args) {
		DifferentClasses d1= new DifferentClasses();
		d1.method4();
		d1.method1();
		d1.method3();
		d1.method6();
		method2();
		method5();
	}
	
	public void method4() 
	{
		System.out.println("4");
		
	}
	
	void method1() 
	{
		
		System.out.println("1");
	}

}
