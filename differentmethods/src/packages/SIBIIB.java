package packages;

public class SIBIIB {              //WAP to print one SIB one IIB and                
	 static                         //check their order of execution and
	{                               //inside SIB print "This is SIB" 5 times
		for(int i=0 ; i<=4; i++)
		{
			System.out.println("This is SIB");
		}
	}
	{
		System.out.println("This is IIB");
	}
	public static void main(String[] args) {
		
      System.out.println("I am main method");
      SIBIIB m1 = new SIBIIB();
	}

}
