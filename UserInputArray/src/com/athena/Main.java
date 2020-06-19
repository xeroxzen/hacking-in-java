package com.athena;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int[] z = new int[10];
        for (int i = 0; i < z.length; i++){
            System.out.println("Print the value of z ["+i+"]");
            z[i] = scanner.nextInt();
        }
        for (int i = 0; i < z.length; i++){
            System.out.println("The value of z["+i+"]" +z[i]);
        }
    }
}
