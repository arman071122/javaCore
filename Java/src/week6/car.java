package week6;

public class car {
    String brand, name, colour;
    int price, speed, mileage;

    void speed() {
	System.out.println(speed + "km/hr");
    }

    void mileage() {
	System.out.println(mileage + "km/l");
    }

    public car(String b, String n, String c, int p, int s, int m) { // constructor, here we are using parametrised
								    // constructor
	brand = b;
	name = n;
	colour = c;
	price = p;
	speed = s;
	mileage = m;
    }
}