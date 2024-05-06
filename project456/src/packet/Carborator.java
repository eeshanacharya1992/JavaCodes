package packet;
 class clutch{
	static void part1()
	{
		System.out.println("I am clutch 1");
	}
	void part2() 
	{
		System.out.println("I am clutch 2");
	}
}
abstract class brake extends clutch{
	abstract void internalcomponents();

    static void airfilter()
    {
    	System.out.println("I am airfilter");
    }
    void coolant ()
    {
    	System.out.println("I am coolant");
    }
}
public class Carborator extends brake {
      static void petrolengine()
      {
    	 System.out.println("I am petrol engine"); 
      }
      void dieselengine()
      {
    	  System.out.println("I am diesel engine");
      }
	public static void main(String[] args) {
		part1();
		airfilter();
		petrolengine();
		Carborator c1= new Carborator();
        c1.part2();
        c1.coolant();
        c1.dieselengine();
        c1.internalcomponents();
	}
	
	void internalcomponents() {
		System.out.println("I have 2 stroke petrol engine and 4 stroke diesel engine");
	}

}
