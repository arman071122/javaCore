package week8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {
    public static void main(String[] args) {
	ArrayList<String> fruits = new ArrayList<String>();

	fruits.add("apple");
	fruits.add("mango");
	fruits.add("banana");
	fruits.add("coconut");

	System.out.println(fruits);
	System.out.println();

	fruits.remove("banana");
	System.out.println(fruits);
	System.out.println();
	fruits.remove(0);
	System.out.println(fruits);
	System.out.println();

	System.out.println(fruits.size());
	System.out.println();

	fruits.removeAll(fruits);
	System.out.println(fruits);
	System.out.println();

	fruits.add("apple");
	fruits.add("banana");
	fruits.add("jackfruit");
	fruits.add("mango");
	fruits.add("coconut");

	System.out.println(fruits);
	System.out.println();

	Iterator itr = fruits.iterator();
	while (itr.hasNext())
	    System.out.println(itr.next());
	System.out.println();

	System.out.println(fruits.contains("plum"));
	System.out.println(fruits.contains("apple"));
	System.out.println();

	ArrayList<String> fruitCopy = new ArrayList<String>();

	fruitCopy.addAll(fruits);

	System.out.println(fruitCopy);
	System.out.println();

	fruitCopy.add("dates");
	System.out.println(fruits);
	System.out.println(fruitCopy);

	fruitCopy.retainAll(fruits);

	System.out.println();
	System.out.println(fruitCopy);

	Object[] arr = fruitCopy.toArray();
	for (int i = 0; i < arr.length; i++)
	    System.out.println(arr[i]);

	System.out.println();
	System.out.println(fruitCopy.isEmpty());

	System.out.println();
	System.out.println(fruits);
	System.out.println(fruitCopy);
	System.out.println(fruits.equals(fruitCopy));

    }
}
