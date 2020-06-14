package com.athena;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
//        Formatting numbers
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.2);
        System.out.println(result);
    }
}
