package introduction;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		final String LP = Long.toString(Long.MAX_VALUE);
		final String LN = Long.toString(Long.MIN_VALUE);
		int T = ent.nextInt();
		for (int i = 1; i <= T; i++) {
			String n = ent.next();
			if (n.replace("-", "").length() > 19) {
				System.out.println(n + " can't be fitted anywhere.");
			} else if (!(n.startsWith("-")) && n.replace("-", "").length() == 19) {
				long np = Long.parseLong(n.substring(0, 18));
				if (np > Long.parseLong(LP.substring(0, 18))) {
					System.out.println(n + " can't be fitted anywhere.");
				} else if (np == Long.parseLong(LP.substring(0, 18))) {
					int npf = Integer.parseInt(n.substring(18));
					if (npf > Integer.parseInt(LP.substring(18))) {
						System.out.println(n + " can't be fitted anywhere.");
					}else {
						System.out.println(n + " can be fitted in:\n* long");
					}
				}
			}else if (n.startsWith("-") && n.length() == 20) {
				long nn = Long.parseLong(n.substring(0, 19));
				if (nn < Long.parseLong(LN.substring(0, 19))) {
					System.out.println(n + " can't be fitted anywhere.");
				} else if (nn == Long.parseLong(LN.substring(0, 19))) {
					int nnf = Integer.parseInt(n.substring(19));
					if (nnf > Integer.parseInt(LN.substring(19))) {
						System.out.println(n + " can't be fitted anywhere.");
					}else {
						System.out.println(n + " can be fitted in:\n* long");
					}
				}
			}else if (Long.parseLong(n) <= Byte.MAX_VALUE && Long.parseLong(n) >= Byte.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* byte\n* short\n* int\n* long");
			} else if (Long.parseLong(n) <= Short.MAX_VALUE && Long.parseLong(n) >= Short.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* short\n* int\n* long");
			} else if (Long.parseLong(n) <= Integer.MAX_VALUE && Long.parseLong(n) >= Integer.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* int\n* long");
			} else if (Long.parseLong(n) <= Long.MAX_VALUE && Long.parseLong(n) >= Long.MIN_VALUE) {
				System.out.println(n + " can be fitted in:\n* long");
			}
		}
		ent.close();
	}
}
