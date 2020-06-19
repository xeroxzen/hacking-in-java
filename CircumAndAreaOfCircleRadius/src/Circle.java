import java.util.Scanner;

public class Circle {
    public static void circle() {
        Scanner scanner = new Scanner(System.in);
        int radius;
        System.out.println("Enter the radius: ");
        radius = scanner.nextInt();
        System.out.println("Circumference is"+ (2* Math.PI*radius)+ " and area is" + (Math.PI*radius*radius));
    }

    public static void main(String[] args) {
        circle();
    }
}
