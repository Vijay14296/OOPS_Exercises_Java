// Hierarchical Inheritance Example
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = π * r * r");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle = length * breadth");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw(); // Inherited method
        c.area(); // Circle's own method

        Rectangle r = new Rectangle();
        r.draw(); // Inherited method
        r.area(); // Rectangle's own method
    }
}
