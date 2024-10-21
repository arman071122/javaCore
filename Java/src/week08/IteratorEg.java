package week08;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg {
    public static void main(String[] args) {
	ArrayList<String> fruit = new ArrayList<String>();

	fruit.add("apple");
	fruit.add("banana");
	fruit.add("mango");

	Iterator<String> itr = fruit.iterator();
//	itr.remove(); // enable for IllegalStateException
	while (itr.hasNext())
	    System.out.println(itr.next());

	System.out.println();

//	itr.next();  // enable for NoSuchElementException
//	itr.remove();

	fruit.add("dates");

	itr = fruit.iterator(); // resetting

	itr.next();// points to apple
	itr.remove();// removes apple
	itr.next();// points to banana
	itr.remove();// removes banana
	while (itr.hasNext())
	    System.out.println(itr.next());
    }
}
