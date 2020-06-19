package com.athena;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int radius;
        System.out.println("Enter radius: ");
        radius = scanner.nextInt();
        System.out.println("Circumference is "+ (2 * Math.PI* radius) + " and area is "+ (Math.PI * radius*radius));
    }
}
