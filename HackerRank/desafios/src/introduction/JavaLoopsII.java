package introduction;

import java.util.Scanner;

public class JavaLoopsII {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int q = ent.nextInt();
		for (int i = 1; i <= q; i++) {
			int a = ent.nextInt();
			int b = ent.nextInt();
			int n = ent.nextInt();
			int result = a + 1 * b;
			System.out.print(result);
			for (int j = 1; j < n; j++) {
				result += (int) Math.pow(2, j) * b;
				System.out.print(" " + result);
			}
			System.out.println();
		}
		ent.close();
	}
}
