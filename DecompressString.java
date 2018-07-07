//Decompress string - string (s) followed by {n} denotes s repeating n times 
//"a(b(c){2}){2}d" decompresses to "abccbccd" 
//"((x){3}(y){2}z){2}" decompresses to "xxxyyzxxxyyz"

package iventure;

public class DecompressString {

	public String decompress(String s) {
		int leftIndex = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '(') {
				leftIndex = i;
			}
			if (s.charAt(i) == '{' && s.charAt(i - 1) == ')') {
				String leftPart = s.substring(0, leftIndex);
				String[] parts = s.substring(leftIndex + 1, i + 2).split("\\)\\{");
				String part = repeatString(parts[0], Integer.parseInt(parts[1]));
				String rightPart = s.substring(i + 3, s.length());
				s = leftPart + part + rightPart;
				return decompress(s);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "a(b(c){2}){2}d";
		//String s = "((x){3}(y){2}z){2}";
		DecompressString decompress = new DecompressString();
		String out = decompress.decompress(s);
		System.out.println(out);
	}

	private static String repeatString(String string, int parseInt) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < parseInt; i++) {
			str.append(string);
		}
		return str.toString();
	}

}
