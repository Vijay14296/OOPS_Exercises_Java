// Multilevel Inheritance Example
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.start(); // Inherited from Vehicle
        eCar.drive(); // Inherited from Car
        eCar.charge(); // Defined in ElectricCar
    }
}
