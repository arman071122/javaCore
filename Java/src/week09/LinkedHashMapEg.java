package week09;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {
    public static void main(String[] args) {
	Map<String, Integer> list = new LinkedHashMap<String, Integer>();
	list.put("arman", 50000);
	list.put("shreyas", 60000);
	list.put("fijo", 50009);
	list.put("pooja", 54000);
	list.put("rohan", 57000);

	System.out.println(list.keySet());
	System.out.println(list.values());
	System.out.println(list.entrySet());
	System.out.println(list.remove("shreyas"));
	System.out.println(list.remove("fijo", 50009));
	System.out.println(list.entrySet());
	System.out.println(list.containsKey("arman"));
	System.out.println(list.values());
    }

}
