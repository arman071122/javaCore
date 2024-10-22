package week10;

interface Greeting {
    void sayHello();
}

public class AnonymousClassEg {

    public static void main(String[] args) {
	Greeting greeting = new Greeting() {
	    @Override
	    public void sayHello() {
		System.out.println("hai");
	    }
	};
	greeting.sayHello();
    }
}
