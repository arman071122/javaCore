package week09;

import java.util.Comparator;

public class ProNameDesc implements Comparator<ProductDetails> {

    @Override
    public int compare(ProductDetails o1, ProductDetails o2) {
	return o2.name.compareTo(o1.name);
    }
}
