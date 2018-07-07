package iventure;

//Given two lowercase strings, S1 and S2, sort S1 in same order as S2. 

//If a character in S1 doesn't exist in S2, put them at the end. If S1 is "program" and S2 is "grapo", then return "grrapom".

public class SortingStringMNOrder {

	public static void main(String[] args) {
		String s1 = "program";
		String s2 = "grapo";
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder();
		for (char ch : s2.toCharArray()) {
			for (int i = 0; i < sb1.length(); i++) {
				if (ch == sb1.charAt(i)) {
					sb2.append(sb1.charAt(i));
					//sb1.deleteCharAt(i);
					sb1.setCharAt(i,' ');
				}
			}
		}
		if (!(sb1.length() == 0)) {
			String s3 = sb1.toString().replaceAll("\\s","");
			sb2.append(s3);
		}
		System.out.println("Sorted string : " + sb2);
	}

}
