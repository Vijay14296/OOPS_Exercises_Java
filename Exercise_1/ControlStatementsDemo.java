import java.util.Scanner;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        TestControlStatements.run(); // delegate to test class
    }
}

class TestControlStatements {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        // If-else-if ladder
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // Switch case
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // For loop with continue
        System.out.println("Numbers 1 to 5 (skip 3):");
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;
            System.out.print(i + " ");
        }

        // While loop with break
        System.out.println("\nWhile loop (break at 3):");
        int i = 1;
        while (i <= 5) {
            if (i == 3)
                break;
            System.out.print(i + " ");
            i++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop (prints at least once):");
        int x = 10;
        do {
            System.out.println("x = " + x);
            x++;
        } while (x < 10); // condition false but executes once

        // Return statement
        if (num == 99) {
            System.out.println("You entered 99, exiting early...");
            sc.close();
            return; // exits the method early
        }

        System.out.println("Program completed normally.");
        sc.close();
    }
}