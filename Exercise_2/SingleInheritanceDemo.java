// Single Inheritance Example
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal { // Dog inherits from Animal
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // Inherited method
        d.bark(); // Own method
    }
}
