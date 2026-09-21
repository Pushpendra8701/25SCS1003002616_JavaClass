public class PrimitiveWrapperDemo {

    public static void main(String[] args) {

        // Primitive variables
        byte byteValue = 10;
        short shortValue = 100;
        int intValue = 1000;
        long longValue = 10000L;
        float floatValue = 10.5f;
        double doubleValue = 20.55;
        char charValue = 'A';
        boolean booleanValue = true;

        // Wrapper variables
        Byte byteWrapper = 10;
        Short shortWrapper = 100;
        Integer intWrapper = 1000;
        Long longWrapper = 10000L;
        Float floatWrapper = 10.5f;
        Double doubleWrapper = 20.55;
        Character charWrapper = 'A';
        Boolean booleanWrapper = true;

        // Display primitive values
        System.out.println("Primitive Variables:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        // Display wrapper values
        System.out.println("\nWrapper Variables:");
        System.out.println("Byte: " + byteWrapper);
        System.out.println("Short: " + shortWrapper);
        System.out.println("Integer: " + intWrapper);
        System.out.println("Long: " + longWrapper);
        System.out.println("Float: " + floatWrapper);
        System.out.println("Double: " + doubleWrapper);
        System.out.println("Character: " + charWrapper);
        System.out.println("Boolean: " + booleanWrapper);
    }
}