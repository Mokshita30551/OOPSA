package co1n2;

import java.util.Scanner;
public class PasswordStrengthDemo {
    public static void validate(String pwd) throws WeakPasswordException {
        if (pwd == null || pwd.length() < 8 || !pwd.matches(".*\d.*")) {
            throw new WeakPasswordException("Password must be >=8 chars and contain a number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();
        try {
            validate(pwd);
            System.out.println("Strong password.");
        } catch (WeakPasswordException e) {
            System.out.println("Weak: " + e.getMessage());
        }
    }
}