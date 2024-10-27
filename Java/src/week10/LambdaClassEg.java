package week10;

interface greeting1 {
    public void sayHai(String name);
}

public class LambdaClassEg {
    public static void main(String[] args) {
	greeting1 g1 = (name) -> {
	    System.out.println("Hai guys" + name);
	};
	g1.sayHai(" arman");
    }
}
