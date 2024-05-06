package package23;

public class Eshu 
{
	String name;
	int rollno;
	void studentdetails(String name, int rollno)
	{
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public static void main(String[] args) 
	{
		Eshu m1= new Eshu();
		m1.studentdetails("Debasis Samal", 1101219505);
		
	}

}
