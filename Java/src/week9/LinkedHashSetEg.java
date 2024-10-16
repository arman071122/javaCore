package week9;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {
    public static void main(String[] args) {
	LinkedHashSet<Object> lset = new LinkedHashSet<Object>();

	lset.add(51);
	lset.add(74);
	lset.add(27);
	lset.add(16);

	System.out.println("LinkedHashSet: " + lset);
    }
}
