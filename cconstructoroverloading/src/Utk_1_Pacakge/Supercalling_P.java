package Utk_1_Pacakge;

/*class ABC
{
	
	ABC(int a)
	{
		System.out.println("one");
			
		}
	}  
class XYZ extends ABC
{
	  XYZ (int a, String b) {
		  
		  super(10);
		  
		  System.out.println("Two");// yet to print 
	  }
	  
	         
public class Supercalling_P extends XYZ {
	/*Supercalling_P()
	{
		System.out.println(3);
	}
	
	public static void main(String[] args) {

		XYZ s1= new XYZ(20, "NAJU");	
		
	
		
	
}
}
*/

class Uthkarsha
{
	Uthkarsha(int a)
	{
		System.out.println(1);
	}
}
class Usha extends Uthkarsha
{
	Usha(int a,float b)
	{
		super(15);
		System.out.println(2);//yet to print
	}
}
class Jassy extends Usha
{
	Jassy(int c, String b,double m)
	{
		super(12,2.36f);
		System.out.println(4); //yet to print
	}
}
//class Sreedevi  
//{
	//Sreedevi()
	//{
	//	System.out.println(4);
	//}
//}
	public class Supercalling_P{
		Supercalling_P()
		{
			System.out.println(3);
		}	
public static void main(String[] args)
{
	Jassy j1=new Jassy(10,"Sandhya",1.23);
	
}
	}



