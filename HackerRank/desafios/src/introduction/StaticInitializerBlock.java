package introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
	public static int B,H;

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        B = ent.nextInt();
        H = ent.nextInt();
        if(B > 0 && H > 0){
            int area = B * H;
            System.out.println(area);
        } else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        ent.close();
    }
}
