package strings;

import java.util.Scanner;

public class SubstringsComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		largest = s.substring(0, k);
		smallest = s.substring(0, k);
		for(int i = 0; i + k <= s.length(); i++) {
		 String c = s.substring(i, i + k);
		 if(smallest.compareTo(c) >= 1) {
			 smallest = c;
			 continue;
		 }
		 if(largest.compareTo(c) <= -1) {
			 largest = c;
		 }
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
