package introduction;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int T = ent.nextInt();
		for (int i = 0; i < T; i++) {
			try {
				long n = ent.nextLong();
				if (n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE) {
					System.out.println(n + " can be fitted in:\n* byte\n* short\n* int\n* long");
				} else if (n <= Short.MAX_VALUE && n >= Short.MIN_VALUE) {
					System.out.println(n + " can be fitted in:\n* short\n* int\n* long");
				} else if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE) {
					System.out.println(n + " can be fitted in:\n* int\n* long");
				} else if (n <= Long.MAX_VALUE && n >= Long.MIN_VALUE) {
					System.out.println(n + " can be fitted in:\n* long");
				}
			}catch(Exception e){
				System.out.println(ent.next() + " can't be fitted anywhere.");
			}
		}
		ent.close();
	}
}
