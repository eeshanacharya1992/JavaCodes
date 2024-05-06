package packages;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String s1 = "India is my Country";
		String split[] =s1.split(" ", 5);
		System.out.println(Arrays.toString(split));

	}

}
