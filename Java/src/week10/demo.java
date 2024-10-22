package week10;

public interface demo {
    void display();
}

class democlass {
    public static void main(String[] args) {
	demo d = new demo() {

	    @Override
	    public void display() {
		System.out.println("hai");
	    }
	};
    }
}