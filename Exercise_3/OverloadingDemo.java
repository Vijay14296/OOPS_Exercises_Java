// Method Overloading Example
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) { // Same method name, different parameters
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of integers: " + calc.add(5, 10));
        System.out.println("Sum of doubles: " + calc.add(3.5, 2.7));
    }
}
