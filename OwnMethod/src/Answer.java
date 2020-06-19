import java.util.Scanner;

public class Answer {
    public static void Sum() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Enter a number: ");
        x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        y = scanner.nextInt();

        System.out.println("Sum is " + (x+y));
    }
    public static void main(String[] args) {
        Sum();
    }
}
