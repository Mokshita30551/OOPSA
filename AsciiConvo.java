
//import.java.util.Scanner;
package varshitha;
import java.util.Scanner;

public class AsciiConvo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int asciiValue = (int) ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + asciiValue);

        sc.close();
    }
}
