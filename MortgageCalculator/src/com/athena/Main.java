package com.athena;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT = 100;

<<<<<<< HEAD

=======
>>>>>>> 44a8809fa564ee62562026fb43077658acbac8af
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a principal between $1,000 and 1,000,000");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
