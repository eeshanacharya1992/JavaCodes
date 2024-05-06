package packet;
interface Black{
	void silver();
}
interface Brown extends Black {
	void golden();
   
} 
abstract class Grey implements Brown{
	abstract void green();
	static void red(){
		System.out.println("I am Red");
	}
	void orange() {
		System.out.println("I am Orange");
	}
	
}
public class BlueInterface extends Grey{

	public static void main(String[] args) {
		BlueInterface b1= new BlueInterface();
		b1.silver();
		b1.golden();
		b1.green();
		b1.orange();
		red();

	}

	
	public void golden() {
		
		System.out.println("I am Golden");
	}

	
	public void silver() {
		
		System.out.println("I am Silver");
	}

	
	void green() {
		
		System.out.println("I am Green");
	}

}
