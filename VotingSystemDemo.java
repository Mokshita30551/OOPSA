package co1n2;
import java.util.Scanner;
public class VotingSystemDemo {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be >= 18");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        try {
            checkEligibility(age);
            System.out.println("Eligible to vote.");
        } catch (InvalidAgeException e) {
            System.out.println("Not eligible: " + e.getMessage());
        }
    }
}