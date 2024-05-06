package package22;

public class NonStatic 
{   int a;
    String b;
	
    void add(int a,String b)
    {
    	System.out.println(a);
    	System.out.println(b);
    }
	public static void main(String[] args) 
	{
		NonStatic m1= new NonStatic();
		m1.add(22, "Roll No");
		System.out.println(m1.a);
		System.out.println(m1.b);
	}

}
