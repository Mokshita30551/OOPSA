import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class VoterRegistration {
    public void registerVoter(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Registration failed: " + name + " is under 18 years old.");
        } else {
            System.out.println("Registration successful! Welcome, " + name + ".");
        }
    }
}

public class VoterPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VoterRegistration registration = new VoterRegistration();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            registration.registerVoter(name, age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using the Voter Registration Portal.");
        }

        sc.close();
    }
}
