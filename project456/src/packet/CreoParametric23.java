package packet;
interface Proengineer23
{
	void figure5();
	void figure6();
}
interface CATIA13 
{
	void figure7();
	void figure8();
}
public class CreoParametric23 implements CATIA13,Proengineer23 {

	public static void main(String[] args) {
		 CreoParametric23 s1= new  CreoParametric23();
		
		 s1.figure7();
		 s1.figure8();
		 s1.figure5();
		 s1.figure6();
	}

	@Override
	public void figure7() {
		System.out.println("CrankShaft");
		
	}

	@Override
	public void figure8() {
		System.out.println("MillingMachine");
		
	}

	@Override
	public void figure5() {
		System.out.println("BrytonCycle");
		
	}

	@Override
	public void figure6() {
		System.out.println("HotAndColdWorking");
		
	}

}
