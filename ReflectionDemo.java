package co1n2;

class Product {
    public void showDetails() {
        System.out.println("Product Name: Laptop | Price: $80000");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Product");
        Object obj = cls.getDeclaredConstructor().newInstance();
        cls.getMethod("showDetails").invoke(obj);
    }
}
