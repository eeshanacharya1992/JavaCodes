package packet;

abstract class Google
{
	abstract void mole();
	static void mule(){
	 System.out.println("loool");	
	}
	
} 

public class AbstractMethod extends Google {
       static void ash()
       {
    	   System.out.println("ji");
       }
	public static void main(String[] args) {
	   ash();
	   AbstractMethod s= new AbstractMethod();
	   s.mole();
	   mule();
	}
	@Override
	void mole() {
		System.out.println("lo");
		
	}

}
