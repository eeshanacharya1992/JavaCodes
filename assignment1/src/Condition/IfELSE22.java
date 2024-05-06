package Condition ;
public class IfELSE22 {

	public static void main(String[] args) {
		int a=22;
		int b=12;
		int c=33;
		int d=44;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("Tall is "+a);
					
				}
				else if(b>c)
				{
				   if(b>d)
				   {
					   System.out.println("Tall is "+b);
				   }
				   else
				   {
					   System.out.println("Tall is "+d);
				   }
			    }
				else if(c>d)
				{
					System.out.println("Tall is "+c);
				}
				else
				{
					System.out.println("Tall is "+d);
				}
				
			}
			else
			{
				System.out.println("Tall is "+c);
			}
			

		}   
	//	else
	//	{
	//		
	//	}
	}
}
