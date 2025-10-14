import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        TestIO.run(); // delegate to second class
    }
}

class TestIO {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Output
        System.out.println("Hello " + name + ", you are " + age + " years old!");

        scanner.close();
    }
}