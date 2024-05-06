package packet;

public class ArrayCheckIndex {

	public static void main(String[] args) {
		String index[]= new  String [4];
		index[0]="Ram";
		index[1]="Vishnu";
		index[2]="Krishna";
		index[3]="Keshav";
		if(index.length==4)
		{   System.out.println("Display all index");
			for(int i=0; i<index.length;i++)
			{
				System.out.println(index[i]);
			}
		}
		else
		{
			System.out.println("Do not display index");
		}
	}

}
