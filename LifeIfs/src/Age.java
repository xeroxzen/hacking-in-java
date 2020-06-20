import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your age: ");
        age = scanner.nextInt();
        canDrink();
        canDrive();
        canVote();
    }
    public static void canVote(){
        if (age >= 18)
            System.out.println("You can vote");
        else
            System.out.println("You cannot vote");
    }
    public static void canDrive(){
        if (age >= 17)
            System.out.println("You can drive a car");
        else
            System.out.println("You cannot drive a car");
    }

    public static void canDrink(){
        if (age >= 21)
            System.out.println("You can drink alcohol");
        else
            System.out.println("You cannot drink alcohol");
    }
}
