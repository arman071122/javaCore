package week9;

import java.util.HashSet;

public class HashSetEg {
    public static void main(String[] args) {
	HashSet<Integer> numbers = new HashSet<Integer>();

	numbers.add(51);
	numbers.add(74);
	numbers.add(27);
	numbers.add(16);

	System.out.println("HashSet: " + numbers);
    }
}
