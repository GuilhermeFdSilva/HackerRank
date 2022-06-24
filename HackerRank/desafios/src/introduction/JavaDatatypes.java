package introduction;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int T = ent.nextInt();
		for (int i = 1; i <= T; i++) {
			String n = ent.next();
			if (n.replace("-", "").length() <= 19) {
				System.out.println(n + " can't be fitted anywhere.");
			} else if (Long.parseLong(n) <= Byte.MAX_VALUE && Long.parseLong(n) >= Byte.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* byte\n* short\n* int\n* long");
			}else if (Long.parseLong(n) <= Short.MAX_VALUE && Long.parseLong(n) >= Short.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* short\n* int\n* long");
			}else if (Long.parseLong(n) <= Integer.MAX_VALUE && Long.parseLong(n) >= Integer.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* int\n* long");
			}else if (Long.parseLong(n) <= Long.MAX_VALUE && Long.parseLong(n) >= Long.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* long");
			}
		}
		ent.close();
	}
}
