package week09;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {
    public static void main(String[] args) {
	Map<String, Integer> m = new HashMap<String, Integer>();
	m.put("arman", 50000);
	m.put("shreyas", 60000);
	m.put("fijo", 50009);
	m.put("pooja", 54000);
	m.put("rohan", 57000);

	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.entrySet());
	System.out.println(m.remove("shreyas"));
	System.out.println(m.remove("fijo", 50009));
	System.out.println(m.entrySet());
	System.out.println(m.containsKey("arman"));
	System.out.println(m.values());
	for (Map.Entry<String, Integer> e : m.entrySet()) {
	    System.out.println(e.getValue());
	    System.out.println(e.getKey());
	}
    }

}
