package iventure;

import java.util.HashMap;

public class SortingStringMOrderN {

	public static void main(String[] args) {
		String s1 = "program";
		String s2 = "grapo";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s1.charAt(i);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, ++count);

			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for (char ch2 : s2.toCharArray()) {
			if (map.containsKey(ch2)) {
				int i = map.get(ch2);
				while (i > 0) {
					sb.append(ch2);
					map.remove(ch2);
					i--;
				}
			}
		}
		if (!(map.isEmpty())) {
			for (char ch3 : map.keySet()) {
				sb.append(ch3);
			}
		}
		System.out.println(sb);
	}

}
