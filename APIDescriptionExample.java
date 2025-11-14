// APIDescriptionExample.java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Step 1: Define custom annotation
@Retention(RetentionPolicy.RUNTIME)  // Make it available at runtime
@Target({ElementType.TYPE, ElementType.METHOD})  // Can be applied to class & method
@interface APIDescription {
    String description();
}

// Step 2: Annotate a class and method
@APIDescription(description = "Handles product-related operations in the system.")
class ProductService {

    @APIDescription(description = "Fetches product details by product ID.")
    public void getProductById(int id) {
        System.out.println("Fetching product with ID: " + id);
    }
}

// Step 3: Use reflection to read and print annotation values
public class APIDescriptionExample {
    public static void main(String[] args) {
        try {
            // Load the class dynamically
            Class<?> cls = Class.forName("ProductService");

            // Check if class has the annotation
            if (cls.isAnnotationPresent(APIDescription.class)) {
                APIDescription classAnnotation = cls.getAnnotation(APIDescription.class);
                System.out.println("Class Annotation -> " + classAnnotation.description());
            }

            // Loop through all methods
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(APIDescription.class)) {
                    APIDescription methodAnnotation = method.getAnnotation(APIDescription.class);
                    System.out.println("Method Annotation -> " + method.getName() + ": " + methodAnnotation.description());
                }
            }

            // Create object and call the method (optional demonstration)
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method m = cls.getMethod("getProductById", int.class);
            m.invoke(obj, 101);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
