package varshitha;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Single expression for average
        double average = (num1 + num2 + num3) / 3;

        System.out.println("Average = " + average);
        System.out.println("Note: Parentheses ensure addition happens before division.");

        sc.close();
    }
}
