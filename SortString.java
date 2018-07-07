package iventure;

import java.util.HashSet;

//Given two lowercase strings, S1 and S2, sort S1 in same order as S2. 

//If a character in S1 doesn't exist in S2, put them at the end. If S1 is "program" and S2 is "grapo", then return "grrapom".

public class SortString {
	private static String s1 = "program";
	private static String s2 = "grapo";

	public static void main(String[] args) {

		HashSet<Character> map = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : s2.toCharArray()) {
			map.add(c);
			for (char c1 : s1.toCharArray()) {
				if (c == c1) {
					sb.append(c);
				}
			}
		}
		for (char c : s1.toCharArray()) {
			if (!(map.contains(c))) {
				sb.append(c);
			}
		}
		System.out.println("Sorted string : "+sb);
	}

}
