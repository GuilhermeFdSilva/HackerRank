package introduction;

import java.util.Scanner;

public class IntToString {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
        int n = ent.nextInt();
        if(n <= 100 && n >= -100){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
        ent.close();
	}
}
