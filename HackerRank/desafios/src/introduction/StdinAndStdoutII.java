package introduction;

import java.util.Scanner;

public class StdinAndStdoutII {
	public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n = ent.nextInt();
        double d = ent.nextDouble();
        String back = ent.nextLine();
        String s = ent.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n + back);
        ent.close ();
    }
}
