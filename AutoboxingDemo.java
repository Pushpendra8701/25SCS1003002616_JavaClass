public class AutoboxingDemo {

    public static void main(String[] args) {

        // Primitive values
        int number = 100;
        double price = 99.99;
        char grade = 'A';
        boolean status = true;

        // Autoboxing: Primitive → Wrapper Object
        Integer intObject = number;
        Double doubleObject = price;
        Character charObject = grade;
        Boolean booleanObject = status;

        // Display values
        System.out.println("Integer Object: " + intObject);
        System.out.println("Double Object: " + doubleObject);
        System.out.println("Character Object: " + charObject);
        System.out.println("Boolean Object: " + booleanObject);
    }
}