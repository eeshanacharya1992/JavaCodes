package packet;
interface Chapter1
{
	void figure1();
	void figure2();
}
	public class ProEngineer11 implements Chapter1 {

	public static void main(String[] args) {
		ProEngineer11 p1= new ProEngineer11();
		p1.figure1();
		p1.figure2();
	}

	
	public void figure1() {
		
		System.out.println("Front end");
	}

	
	public void figure2() {
		
		System.out.println("Back end");
	}

}
