package week06;

public class product {
    int price, generation; // characteristics of class "product"
    String name, color, quality;

    void quality() { // behaviour of class "product"
	System.out.println(quality);
    }

    public product() { // No-argument constructor for object initialization with default values
	price = 20000;
	name = "Airpods Max";
	color = "White";
	quality = "****";
    }

    // alternative method for below method but using not using this keyword
//    public product(int p, String n, String c, String q) { // object initialization using parameterised constructor
//	price = p;
//	name = n;
//	color = c;
//	quality = q;
//    }

    // constructor overloading, same name but different parameters
    // so different behaviours
    public product(int price, String name, String color, String quality) { // object initialization using parameterised
									   // constructor
	// 'this' keyword is used to assign the parameter values to instance variables
	this.price = price; // usage of this keyword,here it gives the value in the parameter price to the
			    // instance variable price
	this.name = name;
	this.color = color;
	this.quality = quality;
    }

    public product(int price) { // overloaded constructor
	this.price = price;
    }

    public product(int price, String name, String color) { // overloaded constructor
	this.price = price;
	this.name = name;
	this.color = color;
    }

    public product(int price, String name, String color, int generation) {
	// Using 'this' to call another constructor in the same class
	this(price, name, color); // constructor chaining, reuses another constructor to initialize price,name and
				  // color
	this.generation = generation;
    }

    public void initialize(int p, String n, String c, int g) { // object initialization using initializing
							       // method
	price = p;
	name = n;
	color = c;
	generation = g;
    }

    // alternative method for above method but using this keyword
//    public void initialise(int price, String name, String color, int generation) { //object initialization using initializing method
//	this.price = price;
//	this.name = name;
//	this.color = color;
//	this.generation = generation;
//    }

}
