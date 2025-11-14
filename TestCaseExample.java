// TestCaseExample.java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Step 1: Define custom annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Can be applied to methods only
@interface TestCase {
    String expectedOutput();
    int timeout();  // milliseconds
}

// Step 2: Create a sample class with test methods
class Calculator {

    @TestCase(expectedOutput = "4", timeout = 1000)
    public int add() {
        return 2 + 2;
    }

    @TestCase(expectedOutput = "0", timeout = 500)
    public int subtract() {
        return 5 - 5;
    }

    @TestCase(expectedOutput = "120", timeout = 2000)
    public int factorial() {
        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Step 3: Main class using reflection to read annotation values
public class TestCaseExample {
    public static void main(String[] args) {
        try {
            // Load the Calculator class dynamically
            Class<?> cls = Class.forName("Calculator");

            // Create an instance
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Iterate through all methods
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(TestCase.class)) {
                    TestCase test = method.getAnnotation(TestCase.class);

                    System.out.println("Running Test: " + method.getName());
                    System.out.println("Expected Output: " + test.expectedOutput());
                    System.out.println("Timeout: " + test.timeout() + " ms");

                    // Invoke the method and display actual output
                    Object result = method.invoke(obj);
                    System.out.println("Actual Output: " + result);

                    // Compare expected vs actual
                    if (String.valueOf(result).equals(test.expectedOutput())) {
                        System.out.println("✅ Test Passed!\n");
                    } else {
                        System.out.println("❌ Test Failed!\n");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
