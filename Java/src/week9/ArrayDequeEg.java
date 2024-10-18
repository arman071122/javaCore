package week9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeEg {
    public static void main(String[] args) {
	Deque<Integer> dq = new ArrayDeque<Integer>();
	dq.add(80);
	dq.add(12);
	dq.add(46);
	dq.add(90);
	dq.add(29);
	dq.add(46);

	System.out.println(dq.peekFirst());
	System.out.println();
	System.out.println(dq.peekLast());
	System.out.println();

	dq.addFirst(76);
	System.out.println(dq.peekFirst());
	System.out.println();
	Iterator descendingIterator = dq.descendingIterator();
	while (descendingIterator.hasNext()) {
	    System.out.println(descendingIterator.next());
	}
    }
}
