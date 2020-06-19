import java.util.Scanner;

public class Product {
    public static void product(){
        Scanner scanner = new Scanner(System.in);

        int x, y;
        int ans;
        System.out.println("Enter the first number: ");
        x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        y = scanner.nextInt();
        ans = x * y;
        System.out.println("Product is "+ ans);
    }

    public static void main(String[] args){
        product();
    }
}
