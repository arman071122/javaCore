package week4;

//Parent class (Superclass)
class Animal1 {
    String name;

    void eat() {
	System.out.println(name + " is eating.");
    }

    void sleep() {
	System.out.println(name + " is sleeping.");
	System.out.println();
    }
}

//Child class (Subclass) that inherits from Animal
class Dog1 extends Animal1 {
    void bark() {
	System.out.println(name + " is barking.");
    }
}

//Class that inherits from Dog
public class MultilevelInheritance extends Dog1 {
    public static void main(String[] args) {
	MultilevelInheritance dog1 = new MultilevelInheritance();
	dog1.name = "Shreyas";

	// Calling methods from the Animal superclass
	dog1.eat();
	dog1.sleep();

	// Calling method from the Dog class
	dog1.bark();
    }
}
