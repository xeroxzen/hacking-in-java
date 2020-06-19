import java.util.Scanner;

public class VotingAge {
    public static void canVote(){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18)
        System.out.println("You are eligible to vote");
        else
        System.out.println("Not eligible to vote");
    }

    public static void main(String[] args){
        canVote();
    }
}
