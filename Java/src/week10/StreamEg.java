package week10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEg {
    public static void main(String[] args) {
	List<Integer> li = new ArrayList<Integer>();
	li.add(23);
	li.add(45);
	li.add(12);
	li.add(88);

	List<Integer> s = li.stream().map(x -> x * 1000).sorted().collect(Collectors.toList());
	for (Integer i : s)
	    System.out.println(i);
    }

}
