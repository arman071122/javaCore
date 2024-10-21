package week06;

public class Circle {
    int radius;

    public Circle(int r) {
	radius = r;
    }

    public Circle(Circle other) { // copy
	radius = other.radius;
    }

    public double calculateArea() {
	return Math.PI * radius * radius;
    }

    public void display() {
	System.out.println("Circle radius: " + radius);
    }

    public static void main(String[] args) {
	Circle circle1 = new Circle(5);
	System.out.println("Original Circle:");
	circle1.display();
	System.out.println("Area: " + circle1.calculateArea());

	Circle circle2 = new Circle(circle1);
	System.out.println("\nCopied Circle:");
	circle2.display();
	System.out.println("Area: " + circle2.calculateArea());
    }
}