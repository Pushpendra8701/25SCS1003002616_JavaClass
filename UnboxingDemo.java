public class UnboxingDemo {

    public static void main(String[] args) {

        // Wrapper objects
        Integer intObject = 100;
        Double doubleObject = 99.99;
        Character charObject = 'A';
        Boolean booleanObject = true;

        // Unboxing: Wrapper Object → Primitive
        int number = intObject;
        double price = doubleObject;
        char grade = charObject;
        boolean status = booleanObject;

        // Display converted values
        System.out.println("int value: " + number);
        System.out.println("double value: " + price);
        System.out.println("char value: " + grade);
        System.out.println("boolean value: " + status);
    }
}