public class CastingDemo {
    public static void main(String[] args) {
        int intValue = 50;       
        double doubleValue = intValue; 
        System.out.println("Implicit Casting (int to double):");
        System.out.println("Original int value: " + intValue);
        System.out.println("Converted double value: " + doubleValue);
        doubleValue = 99.99; 
        intValue = (int) doubleValue;        
        System.out.println("\nExplicit Casting (double to int):");
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted int value: " + intValue);
        double largeValue = 12345.6789;
        int truncatedValue = (int) largeValue; 
        System.out.println("\nExplicit Casting with Loss of Precision:");
        System.out.println("Original double value: " + largeValue);
        System.out.println("Converted int value (truncated): " + truncatedValue);
    }
}
