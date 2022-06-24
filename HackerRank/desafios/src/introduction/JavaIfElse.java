package introduction;

import java.util.Scanner;

public class JavaIfElse {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n = ent.nextInt();
		if (n % 2 == 0 && n >= 2 && n <= 5 || n % 2 == 0 && n > 20) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}
		ent.close();
	}
}