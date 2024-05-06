package cconstructoroverloading23;

public class AssignmentVariables {
     static int a=10;
     static int b=20;
     static void add(int a, int b)
     {
    	 System.out.println(a+b);
     }
     static void sub(int a, int b)
     {
    	 System.out.println(b-a);
     }
     static void multi(int a, int b)
     {
    	 System.out.println(a*b);
     }
	public static void main(String[] args) {
		add(a,b);
		sub(a,b);
		multi(a,b);
		
		

	}

}
