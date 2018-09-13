//1. Write a function that receives string with decimal number (i.e. all characters are decimal digits) and prints the sum of all possible substring-numbers, example: 
//sum(“123”) = 123 + 12 + 23 + 1 + 2 + 3 = 164

package iventure;

public class AddSubStringIntegers {
	private static int sum(String n) {
		if (n == null || n.trim().length() == 0)
			return 0;
		int length = n.length();
		int sum = 0;
		for (int i = 1; i <= length; i++) {
			for (int j = 0; j + i <= length; ++j) {
				System.out.println(n.substring(j, j + i));
				sum += Integer.parseInt(n.substring(j, j + i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		String n = "123";
		int l = sum(n);
		System.out.println("sum = " + l);
	}

}
