package week06;

public class UpcastingDowncasting {
    public static void main(String[] args) {
	// Upcasting: Assigning an instance of Alto (subclass) to Vehicle (superclass)
	// reference
	Vehicle v = new Alto();

	v.speed(); // calls the overridden method from Alto
	v.brand(); // calls the method from Vehicle

	// Downcasting: Casting the Vehicle reference back to an Alto reference
	Alto a = (Alto) v;

	System.out.println(a.noofwheels);

	a.brand();
    }
}
