package com.athena;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        double weight;
        double BMI;
        System.out.println("Enter your height(cm): ");
        height = scanner.nextDouble();
        System.out.println("Enter your body weight(kgs): ");
        weight= scanner.nextDouble();
        BMI = (100*100*weight)/(height*height);
        System.out.println("Your BMI is "+ BMI);

        if (BMI < 18.5)
            System.out.println("underweight");
        else if (BMI >= 18.5 && BMI <= 25)
            System.out.println("Normal");
        else if (BMI >= 25 && BMI <= 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
