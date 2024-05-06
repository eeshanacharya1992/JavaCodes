package packet;
class clutch11{
	void part() 
	{System.out.println("I am clutch ");}}
abstract class brake11 extends clutch11{
	abstract void internalcomponents();
    void coolant ()
    {System.out.println("I am coolant");}}
public class Carborator11 extends brake11 {
    static void petrolengine()
    {
  	 System.out.println("I am petrol engine"); 
    }
    void dieselengine()
    {
  	  System.out.println("I am diesel engine");
    }
	public static void main(String[] args) {
	petrolengine();
	Carborator11 c1= new Carborator11(); 
    c1.coolant();
    c1.dieselengine();
    c1.internalcomponents();}
	void internalcomponents() {
	System.out.println("I have 2 stroke petrol engine ");}}
	



