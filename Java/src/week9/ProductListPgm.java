package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductListPgm {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	ArrayList<ProductDetails> prolist = new ArrayList<>();
	Collections.addAll(prolist, new ProductDetails("Iphone 16", 2344, 75000),
		new ProductDetails("Ipad 12", 4532, 50000), new ProductDetails("Mac M1 16'", 4878, 100000),
		new ProductDetails("Mac M2 16'", 9854, 125000), new ProductDetails("Airpods Pro", 9932, 20000));

	System.out.println(" Before Sorting\n");
	for (ProductDetails product : prolist)
	    System.out.println(product);

	System.out.println("\n Sorting price in ascending order\n");
	Collections.sort(prolist, new ProPriceAsc());
	for (ProductDetails product : prolist)
	    System.out.println(product);

	System.out.println("\n Sorting name in descending order\n");
	Collections.sort(prolist, new ProNameDesc());
	for (ProductDetails product : prolist)
	    System.out.println(product);

	System.out.println("\n Sorting id in ascending order\n");
	Collections.sort(prolist, new ProIdAsc());
	for (ProductDetails product : prolist)
	    System.out.println(product);
    }
}
