package strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int al = A.length() - 1;
		String B = A.substring(al);
		int i = al;
		for(int j = al - 1; j >= 0; j--) {
			String b = A.substring(j, i);
			i--;
			B += b;
		}
		if(A.equals(B)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
