package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			Pattern p = Pattern.compile("([A-Z])(.+)", Pattern.LITERAL);
			Matcher matcher = p.matcher(pattern);
			boolean find = matcher.find();
			if(find){
				System.out.println("Valid");
			}else{
				System.out.println("Invalid");
			}
		}
		in.close();
	}
}
