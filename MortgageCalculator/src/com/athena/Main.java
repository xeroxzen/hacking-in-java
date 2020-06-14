package com.athena;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        double principal;
//        double rate;
//        int n;
        double mortgage;

        Scanner principal = new Scanner(System.in);
        Scanner rate = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        mortgage = principal*rate(1+rate);

    }
}
