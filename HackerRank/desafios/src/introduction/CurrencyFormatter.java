package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	 public static void main(String[] args) {
	        Scanner ent = new Scanner(System.in);
	        double payment = ent.nextDouble();   
	        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
	        System.out.println("US: " + us);
	        String india = NumberFormat.getCurrencyInstance(new Locale("i.e.", "English")).format(payment);
	        System.out.println("India: " + india);
	        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
	        System.out.println("China: " + china);
	        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	        System.out.println("France: " + france);
	        ent.close();
	    }
}
