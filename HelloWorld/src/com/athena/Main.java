package com.athena;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Variables
        int (4bytes), long(8 bytes), float(4 bytes), double(8 bytes), byte(1 byte), short (2bytes), char (2bytes), boolean (1byte);
        Primitive Types
                byte myAge =22;
                byte herAge= myAge;
                long viewsCount= 3_234_678_453L;
                float price =10.99F;
                char letter = 'A';
                boolean isEligible =false;
        System.out.println(herAge);
        Reference Types
                Date now=new Date();
                System.out.println(now);
                byte x=1;
                byte y=x;
                x = 2;
                System.out.println(y);
        */


/*
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point1);
Strings
        String message = new String("Hello World");
        String msg = "Hello World" + "!!";
        System.out.println(msg.length());
*/
/*
        //Escape Sequences
        String message = new String("Hello \"Andile\"");
        System.out.println(message);
*/

/*
        //Arrays
        int [] numbers = {2,3, 5, 6, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //multidimensional arrays
        int [][] myNumbers= { {1,3,4}, {5,7,9} };
        System.out.println(Arrays.deepToString(myNumbers));
*/

/*
        //Constants

        final float PI = 3.14F;
        System.out.println(PI);
*/

/*
        //Arithmetic operations
        int x = 10;
        int y = 3;
        double result = (double)x / (double)y;
        System.out.println(result);
        x++;
*/
/*
        Implicit casting
        byte > short > int > long > float > float > double
        double x = 1.1;
        double y = x + 2;
        String x = "1.2";
        double y = Double.parseDouble(x) + 2;
        int result = Math.round(1.1F);
        int result = (int) Math.round(Math.random() * 100);
        System.out.println(result);
        Formatting numbers
        NumberFormat percent = NumberFormat.getPercentInstance();
        Number chaining
        String result = NumberFormat.getPercentInstance().format(0.2);
        Accepting Input
*/


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);

//        Logical Operators
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);

//        Conditional Statements
//        int temp = 32;
//        if (temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        }
//        else if (temp > 20 && temp <= 30)
//            System.out.println("Beautiful Day");
//        else
//            System.out.println("Cold Day");
//      Simplifying if statements
//        Ternary Operator
//        int income = 120_000;
//        String className = income > 100_000 ? "First Class" : "Economy Class";
//        System.out.println(className);

//        Switch Statements
        String role = "admin";

        switch  (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

//        if (role == "admin")
//            System.out.println("You're an admin");
//        else if (role == "moderator")
//            System.out.println("You're a moderator");
//        else
//            System.out.println("You're a guest");
    }
}
