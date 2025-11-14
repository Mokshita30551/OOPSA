public class DocumentEditor {
    public static void main(String[] args) {
        String document = "Hello world";
        System.out.println("Original Document: " + document);

        String updatedDoc1 = document.replace("world", "Java");
        String updatedDoc2 = document.concat(" - Programming Language");
        String updatedDoc3 = document.toUpperCase();

        System.out.println("After replace(): " + updatedDoc1);
        System.out.println("After concat(): " + updatedDoc2);
        System.out.println("After toUpperCase(): " + updatedDoc3);
        System.out.println("Final Document (unchanged): " + document);
    }
}
