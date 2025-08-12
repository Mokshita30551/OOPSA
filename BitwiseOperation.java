package varshitha;
import java.util.Scanner;


public class BitwiseOperation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("\nBinary format:");
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));

        System.out.println("\nBitwise AND (&): " + (a & b) + " (" + Integer.toBinaryString(a & b) + ")");
        System.out.println("Bitwise OR (|): " + (a | b) + " (" + Integer.toBinaryString(a | b) + ")");
        System.out.println("Bitwise XOR (^): " + (a ^ b) + " (" + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("Left shift a << 1: " + (a << 1) + " (" + Integer.toBinaryString(a << 1) + ")");
        System.out.println("Right shift a >> 1: " + (a >> 1) + " (" + Integer.toBinaryString(a >> 1) + ")");

        sc.close();
    }
}
