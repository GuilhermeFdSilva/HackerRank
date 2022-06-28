package strings;

import java.util.Scanner;

public class StringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.trim();
		if (s.length() != 0) {
			String[] tokens = s.split("[!,?.*_'@\\ ]+");
			System.out.println(tokens.length);
			for (String a : tokens) {
				System.out.println(a);
			}
		} else {
			System.out.println(0);
		}
		scan.close();
	}
}
