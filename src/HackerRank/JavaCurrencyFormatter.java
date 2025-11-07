package HackerRank;

import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Create Locale for India (not available by default)
        Locale indiaLocale = new Locale("en", "IN");

        // Get currency instances for each locale
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Format the payment
        String usFormatted = us.format(payment);
        String indiaFormatted = india.format(payment);
        String chinaFormatted = china.format(payment);
        String franceFormatted = france.format(payment);

        // Print results
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}

