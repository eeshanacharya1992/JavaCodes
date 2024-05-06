package cconstructoroverloading23;

public class India 
{
    India()
    {
    	System.out.println("1");
    }
    India(int a)
    {
    	System.out.println("2");
    }
    India(int a,String b)
    {
    	System.out.println("3");
    }
    India(int a,double b,char c, String d)
    {
    	System.out.println("4");
    }
    India(boolean a,boolean b)
    {
    	System.out.println("5");
    }
	public static void main(String[] args) 
	{
		new India();
		new India(233);
		new India(334,"Hey");
		new India(55,4.5,'A',"Great");
		new India(true,true);
	}

}
