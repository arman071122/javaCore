package week4;

import java.util.Scanner;

// Parent class (Superclass)
class Animal {

    String name;

    void eat() {
	System.out.println(name + " is eating.");
    }

    void sleep() {
	System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass) that inherits from Animal
class Dog extends Animal {

    void bark() {
	System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    void meow() {
	System.out.println(name + " is meowing");
    }
}

public class Inheritance {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	Dog dog = new Dog();
	Cat cat = new Cat();

	System.out.println("Enter choice \n1.Dog\n2.Cat\n");
	int ch = sc.nextInt();

	System.out.println("Enter ur animals name : ");
	String animalName = sc.next();
	switch (ch) {
	case 1: {
	    dog.name = animalName;
	    dog.eat();
	    dog.sleep();
	    dog.bark();
	    break;
	}
	case 2: {
	    cat.name = animalName;
	    cat.eat();
	    cat.sleep();
	    cat.meow();
	    break;
	}
	}
    }
}