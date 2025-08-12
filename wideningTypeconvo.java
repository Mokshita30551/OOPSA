package varshitha;

public class wideningTypeconvo {
	public static void main(String[] args) {
        int numInt = 100;
        long numLong = numInt; // int to long
        float numFloat = numLong; // long to float

        System.out.println("Original int value: " + numInt);
        System.out.println("Converted to long: " + numLong);
        System.out.println("Converted to float: " + numFloat);
        System.out.println("No data lost in widening conversions!");
    }
}
