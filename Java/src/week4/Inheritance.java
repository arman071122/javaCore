package week4;

// Parent class (Superclass)
class Animal {
    // Field (attribute)
    String name;

    // Method (behavior)
    void eat() {
	System.out.println(name + " is eating.");
    }

    void sleep() {
	System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass) that inherits from Animal
class Dog extends Animal {
    // Method specific to Dog class
    void bark() {
	System.out.println(name + " is barking.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
	// Create an object of the Dog class
	Dog dog = new Dog();
	dog.name = "Dog"; // Setting the inherited field

	// Calling methods from the superclass (Animal)
	dog.eat(); // Buddy is eating.
	dog.sleep(); // Buddy is sleeping.

	// Calling method specific to the subclass (Dog)
	dog.bark(); // Buddy is barking.
    }
}
