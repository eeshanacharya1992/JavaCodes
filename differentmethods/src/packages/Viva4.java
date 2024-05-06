package packages;

public class Viva4 {
 static
 {
	 System.out.println("SIB1");
 }
 static
 {
	 System.out.println("SIB2");
 }
 {
	System.out.println("IIB1"); 
 }
 {
	 System.out.println("IIB2");
 }
 Viva4()
 {
	System.out.println("Constructor1");
 }
 Viva4(int a)
 {
	 System.out.println("Constructor2");
 }
	public static void main(String[] args) {
	         new Viva4();
	         new Viva4(54);
	}

}
