package packet;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i=2;i<10; i++)
		{
			if(i%1==0 && (i%i==0 ||i%2!=0) )
			{
				System.out.println(i);
			}
			
		}

	}

}
