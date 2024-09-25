package week6;

public class ProductProgram {
    public static void main(String[] args) {

	// object creation from no argument constructor
	product airpods = new product();
	System.out.println("Name of the product is " + airpods.name);
	System.out.println("Price of the product is " + airpods.price);
	System.out.println("Color of the product is " + airpods.color);
	System.out.println("Quality of the product is " + airpods.quality);

	System.out.println();

	product ipad = new product(); // object creation using reference initialization(assigning values directly to
				      // fields)
	ipad.name = "Ipad SE 4th Gen";
	ipad.price = 40000;
	ipad.color = "Black";
	ipad.quality = "*****";

	System.out.println("Name of the product is " + ipad.name);
	System.out.println("Price of the product is " + ipad.price);
	System.out.println("Color of the product is " + ipad.color);
	System.out.println("Quality of the product is " + ipad.quality);

	System.out.println();

	// object creation using the parameterized constructor
	product iphone = new product(100000, "Iphone 15", "Yellow", "*****");
	System.out.println("Name of the product is " + iphone.name);
	System.out.println("Price of the product is " + iphone.price);
	System.out.println("Color of the product is " + iphone.color);
	System.out.println("Quality of the product is " + iphone.quality);

	System.out.println();

	// object creation using method initialize()
	product macbook = new product();
	macbook.initialize(200000, "Macbook", "White", 4);
	System.out.println("Name of the product is " + macbook.name);
	System.out.println("Price of the product is " + macbook.price);
	System.out.println("Color of the product is " + macbook.color);
	System.out.println(macbook.generation + "th generation product");

	System.out.println();

	// object creation using another parameterized constructor
	product iStand = new product(30000, "iStand", "Grey");
	System.out.println("Name of the product is " + iStand.name);
	System.out.println("Price of the product is " + iStand.price);
	System.out.println("Color of the product is " + iStand.color);
    }
}
