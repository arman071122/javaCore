package week08;

import java.util.ArrayList;

public class ListExp2 {
    class fruits {
	String name;

	fruits(String name) {
	    this.name = name;
	}

	public String toString() {
	    return name;
	}
    }

    public static void main(String[] args) {
	ArrayList<fruits> fruitList = new ArrayList<fruits>();
	ListExp2 list = new ListExp2();

	fruitList.add(list.new fruits("Apple"));
	fruitList.add(list.new fruits("Banana"));

	System.out.println();
    }
}
