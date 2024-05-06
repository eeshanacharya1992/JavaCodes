package arithmetic;

public class Eeshan 
{
    void add()
    {
    	int a=10;
    	int b=20;
    	int c=b+a;
    	System.out.println(c);
    }
    void subtract()
    {
    	int a=10;
    	int b=20;
    	int c=b-a;
        System.out.println(c);
    }
    void multiply()
    {
    	int a=10;
    	int b=20;
    	int c=b*a;
    	System.out.println(c);	
    }
    void division()
    {
    	int a=10;
    	int b=20;
    	int c=b/a;
    	System.out.println(c);
    }
	public static void main(String[] args) 
	{
		Eeshan m=new Eeshan();
		m.add();
		m.subtract();
		m.multiply();
		m.division();
	}

}
