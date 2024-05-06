package arrayproblems;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		String name[] = { "Ram", "Laxman", "Sita", };
		String name1[] = { "Ram", "Laxman", "Sita", };
	//	System.out.println(name[0] + name[1] + name[2]);

		boolean asnwer = Arrays.equals(name, name1);
		System.out.println(asnwer);

	}

}
