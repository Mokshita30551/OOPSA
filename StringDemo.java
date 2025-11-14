public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        String replacedStr = str.replace('H', 'J');
        String concatStr = str.concat(" World");
        System.out.println("After replace(): " + replacedStr);
        System.out.println("After concat(): " + concatStr);
        System.out.println("String after operations: " + str);
    }
}
