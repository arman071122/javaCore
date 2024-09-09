package week4;

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

class Dog1 extends Animal1 {
    void bark() {
	System.out.println(name + " is barking.");
    }
}

public class MultilevelInheritance extends Dog1 {
    public static void main(String[] args) {
	MultilevelInheritance dog1 = new MultilevelInheritance();
	dog1.name = "Shreyas";

	dog1.eat();
	dog1.sleep();

	dog1.bark();
    }
}
