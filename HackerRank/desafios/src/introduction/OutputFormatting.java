package introduction;

import java.util.Scanner;

public class OutputFormatting {
	public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String strin1 = ent.next().trim();
        int n1 = ent.nextInt();
        String strin2 = ent.next().trim();
        int n2 = ent.nextInt();
        String strin3 = ent.next().trim();
        int n3 = ent.nextInt();
        System.out.println("================================");
        System.out.printf("%-15s%03d\n", strin1, n1);
        System.out.printf("%-15s%03d\n", strin2, n2);
        System.out.printf("%-15s%03d\n", strin3, n3);       
        System.out.println("================================");
        ent.close();
    }
}
