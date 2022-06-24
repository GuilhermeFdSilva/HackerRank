package introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutI {
	public static void main(String args[]) {
        Scanner ent = new Scanner(System.in);
        int n1 = ent.nextInt();
        int n2 = ent.nextInt();
        int n3 = ent.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        ent.close();
    }
}
