package stringproblems;

public class NoOfSpecialCharacters {

	public static void main(String[] args) {
		String a="Abhinash 1234@*";
		System.out.println(a.length());
		int alpha=0; int spaces=0;
		int digit=0; int special=0;
		char b[]=a.toCharArray();
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean letter=Character.isAlphabetic(b[i]);
			boolean number=Character.isDigit(b[i]);
			boolean whitespace=Character.isWhitespace(b[i]);
			if(letter==true  )
				{
				   alpha++;
				}
			else if(number==true)
			{
				digit++;
			}
			else if(whitespace==true)
				{
				  spaces++;
				}
			else {
				special++;
			}
			
	}
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(spaces);
		System.out.println(special);
		

}}
