package com.athena;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

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

        //Constants

        final float PI = 3.14F;
        System.out.println(PI);
    }
}
