package packet;

public class ArrayNumberPresent {

	public static void main(String[] args) {
		int num[]= new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		int numbercheck=60;
		for(int i=0;i<=4;i++)
		{
			if(num[i]==numbercheck)
			{
				System.out.println("The number is present");
			   //break;
				
			}
			if(num.length==i+1)
			{
				System.out.println("The number not present");
				break;
			}
		}
	}

}
