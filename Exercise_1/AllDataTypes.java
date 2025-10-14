public class AllDataTypes {
    public static void main(String[] args) {
        TestDataTypes.display(); // delegate to second class
    }
}

// 👇 Non-public class in same file (allowed)
class TestDataTypes {
    public static void display() {
        // Integer types
        byte byteVal = 100;
        short shortVal = 30000;
        int intVal = 100000;
        long longVal = 10000000000L;

        // Floating-point types
        float floatVal = 3.14f;
        double doubleVal = 3.14159265358979;

        // Character type
        char charVal = 'A';

        // Boolean type
        boolean boolVal = true;

        // String (non-primitive)
        String stringVal = "Hello, Java!";

        // Array (non-primitive)
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Output
        System.out.println("byte value: " + byteVal);
        System.out.println("short value: " + shortVal);
        System.out.println("int value: " + intVal);
        System.out.println("long value: " + longVal);
        System.out.println("float value: " + floatVal);
        System.out.println("double value: " + doubleVal);
        System.out.println("char value: " + charVal);
        System.out.println("boolean value: " + boolVal);
        System.out.println("string value: " + stringVal);

        System.out.print("array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // move to next line
    }
}