package com.athena;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Formatting numbers
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        Number chaining
//        String result = NumberFormat.getPercentInstance().format(0.2);
//        Accepting Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
