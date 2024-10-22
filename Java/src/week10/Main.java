package week10;

class OuterClasss {

    void display() {
	class InnerClass {
	    void printMessage() {
		System.out.println("Hello from the InnerClass inside display method");
	    }
	}

	InnerClass inner = new InnerClass();
	inner.printMessage();
    }
}

public class Main {
    public static void main(String[] args) {
	OuterClasss outer = new OuterClasss();
	outer.display();
    }
}
