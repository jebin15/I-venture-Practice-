package sample;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingScheduler {
	static Integer[][] integer = new Integer[][] { { 2, 6 }, { 1, 5 }, { 5, 7 }, { 4, 5 }, { 7, 8 } };
	static Comparator<Integer[]> arrayComparator = new Comparator<Integer[]>() {
		public int compare(Integer[] o1, Integer[] o2) {
			return o1[0].compareTo(o2[0]);
		}
	};

	public static void main(String[] args) {
		Arrays.sort(integer, arrayComparator);
		for (int i = 1; i < integer.length; i++) {
			if (integer[i][0] < integer[i - 1][1]) {
				System.out.println("(" + integer[i][0] + "," + integer[i][1] + ")" + " overlapping with "+"("
						+ integer[i - 1][0] + "," + integer[i - 1][1]+")");
			}
		}
	}
}
