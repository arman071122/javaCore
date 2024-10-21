package week06;

public class CarPgm {
    public static void main(String[] args) {
	car alto = new car("Maruti", "Alto", "Red", 400000, 100, 40); // creating a "car" object "alto" using the
								      // constructor
	System.out.println(alto.brand);
	System.out.println(alto.name);
	System.out.println(alto.colour);
	System.out.println(alto.price);
	alto.speed();
	alto.mileage();

	System.out.println();

	car Innova = new car("Toyota", "Innova", "White", 2000000, 150, 35);
	System.out.println(Innova.brand);
	System.out.println(Innova.name);
	System.out.println(Innova.colour);
	System.out.println(Innova.price);
	Innova.speed();
	Innova.mileage();
    }
}
