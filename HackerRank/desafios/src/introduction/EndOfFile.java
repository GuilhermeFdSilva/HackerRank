package introduction;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int lines = 1;
		while(ent.hasNext()) {
			String n = ent.nextLine();
			System.out.printf("%d %s", lines, n);
			lines++;
		}
		ent.close();
	}
}