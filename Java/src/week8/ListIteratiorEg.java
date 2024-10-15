package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratiorEg {
    public static void main(String[] args) {
	ArrayList<String> fruit = new ArrayList<String>();

	fruit.add("apple");
	fruit.add("banana");
	fruit.add("mango");

	ListIterator<String> li = fruit.listIterator();
	while (li.hasNext())
	    System.out.println(li.next());

	System.out.println();

	while (li.hasPrevious())
	    System.out.println(li.previous());

	System.out.println();

	li.add("jackfruit");
	li = fruit.listIterator();
	while (li.hasNext())
	    System.out.println(li.next());

	System.out.println();

	li.previous();
	li.previous();// points to mango
	li.set("green mango");// replaces mango with green mango

	li = fruit.listIterator();
	while (li.hasNext())
	    System.out.println(li.next());

	System.out.println();

	Iterator i = fruit.iterator();
	while (i.hasNext())
	    System.out.println(i.next());

//	li = fruit.listIterator();
//	while (li.hasNext()) {
//	    li.next();
//	    li.remove();
//	}

	System.out.println();
	Collections.sort(fruit);
	System.out.println(fruit);

    }
}
