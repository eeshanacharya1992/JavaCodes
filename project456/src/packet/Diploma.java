package packet;
interface Undergraduate{
	void student1();
	void student2();
}
  class Postgraduate implements Undergraduate {
	  static void student3()
	  {
		  System.out.println("I am student3");
	  }
	  void student4()
	  {
		  System.out.println("I am student4");
	  }
	  public void student1() {
	  		System.out.println("I am student1");
	  		
	  	}
	  	
	  	public void student2() {
	  		System.out.println("I am student2");
	  		
	  	}
	
}
public class Diploma extends Postgraduate {
     static void student5()
     {
    	 System.out.println("I am student5");
     }
     void student6()
     {
    	 System.out.println("I am student6");
     }
    
    
  
	public static void main(String[] args) {
		student3();
		student5();
		Diploma d1= new Diploma();
		d1.student4();
		d1.student1();
		d1.student2();
		d1.student6();
	}

}
