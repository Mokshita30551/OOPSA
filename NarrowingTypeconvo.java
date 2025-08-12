//import java.util.Scanner;
package varshitha;
import java.util.Scanner;

public class NarrowingTypeconvo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double numDouble = sc.nextDouble();

        int numInt = (int) numDouble; // Explicit cast required

        System.out.println("Original double value: " + numDouble);
        System.out.println("After narrowing to int: " + numInt);
        System.out.println("Note: Fractional part is lost in narrowing conversion.");

        sc.close();
}
}
