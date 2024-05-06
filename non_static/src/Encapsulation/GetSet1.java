package Encapsulation;

class GPT
{
	private double salary=100000;

	
	
	public double get_salary()
{
	return salary;
}
	public void set_salary(double salary)
	{
		this.salary=salary;
	}
}
public class GetSet1 {

	public static void main(String[] args) 
	{
		GPT g1=new GPT();
			g1.set_salary(120000);
		
			g1.get_salary();
			System.out.println(g1.get_salary());
	}
}

