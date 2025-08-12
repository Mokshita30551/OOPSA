package varshitha;

public class primitiveTypes {
 public static void main(String[] args) {
	 byte b = 10;
     short s = 100;
     int i = 1000;
     long l = 100000L;
     float f = 3.14f;
     double d = 3.14159;
     char c = 'A';
     boolean bool = true;

     System.out.println("byte: " + b + " (" + Byte.BYTES + " bytes, " + Byte.SIZE + " bits)");
     System.out.println("short: " + s + " (" + Short.BYTES + " bytes, " + Short.SIZE + " bits)");
     System.out.println("int: " + i + " (" + Integer.BYTES + " bytes, " + Integer.SIZE + " bits)");
     System.out.println("long: " + l + " (" + Long.BYTES + " bytes, " + Long.SIZE + " bits)");
     System.out.println("float: " + f + " (" + Float.BYTES + " bytes, " + Float.SIZE + " bits)");
     System.out.println("double: " + d + " (" + Double.BYTES + " bytes, " + Double.SIZE + " bits)");
     System.out.println("char: '" + c + "' (" + Character.BYTES + " bytes, " + Character.SIZE + " bits)");
     System.out.println("boolean: " + bool + " (size not strictly defined in Java spec)");

 }
}
