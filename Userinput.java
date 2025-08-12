package varshitha;
import java.util.Scanner;

//package varshitha;


public class Userinput {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = sc.nextLine();

    System.out.print("Enter roll number: ");
    int rollNo = sc.nextInt();

    System.out.print("Enter age: ");
    int age = sc.nextInt();

    System.out.print("Enter gender (M/F): ");
    char gender = sc.next().charAt(0);

    System.out.print("Enter percentage: ");
    double percentage = sc.nextDouble();

    System.out.printf("\nStudent Details:\n");
    System.out.printf("Name       : %s\n", name);
    System.out.printf("Roll No.   : %d\n", rollNo);
    System.out.printf("Age        : %d\n", age);
    System.out.printf("Gender     : %c\n", gender);
    System.out.printf("Percentage : %.2f%%\n", percentage);

    sc.close();
}
}
