package com.athena;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String firstName = new String();
	String lastName = new String();
	byte age;
	String profession;
	String gender;
	Date birthday = new Date();

	Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        firstName = scanner.next();
        System.out.print("What is your last name? ");
        lastName = scanner.next();
        System.out.print("How old are you? ");
        age = scanner.nextByte();
        System.out.print("What do you do for a living? ");
        profession = scanner.next();
        System.out.print("Are you Male or Female? ");
        gender = scanner.next();
        System.out.print("Enter your birth date: ");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(profession);
        System.out.println(gender);
        System.out.println(birthday);
    }
}
