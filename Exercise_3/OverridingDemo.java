// Method Overriding Example
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal a; // reference of parent class

        a = new Dog(); // object of Dog
        a.sound(); // Calls Dog's sound()

        a = new Cat(); // object of Cat
        a.sound(); // Calls Cat's sound()
    }
}
