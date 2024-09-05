package week4;

//Parent class (Superclass)
class Animal1 {
    // Field (attribute)
    String name;

    // Method (behavior)
    void eat() {
	System.out.println(name + " is eating.");
    }

    void sleep() {
	System.out.println(name + " is sleeping.");
	System.out.println();
    }
}

//Child class (Subclass) that inherits from Animalss
class Dog1 extends Animal1 {
    // Method specific to Dog class
    void bark() {
	System.out.println(name + " is barking.");
    }
}

//Class that inherits from Dog (further down the inheritance chain)
public class MultilevelInheritance extends Dog1 {
    public static void main(String[] args) {
	// Create an object of InheritanceExample class
	MultilevelInheritance example = new MultilevelInheritance();
	example.name = "Buddy"; // Setting the inherited field

	// Calling methods from the Animal superclass
	example.eat(); // Buddy is eating.
	example.sleep(); // Buddy is sleeping.

	// Calling method from the Dog class
	example.bark(); // Buddy is barking.
    }
}
