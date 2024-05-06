package packet;
interface Proengineer
{
	void figure1();
	void figure2();
}
interface CATIA extends Proengineer
{
	void figure3();
	void figure4();
}
public class CreoParametric implements CATIA {

	public static void main(String[] args) {
		CreoParametric c1= new  CreoParametric();
		c1.figure1();
		c1.figure2();
		c1.figure3();
		c1.figure4();

	}

	
	 public void figure1() {
		
		System.out.println("Tommy Bar");
	}

	
	public void figure2() {
		
		System.out.println("Screw Jack");
	}

	
	public void figure3() {
		System.out.println("Stud Axle");
		
	}

	
	public void figure4() {
		
		System.out.println("Crank Shaft");
	}

}
