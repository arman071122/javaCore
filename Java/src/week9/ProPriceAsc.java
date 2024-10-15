package week9;

import java.util.Comparator;

public class ProPriceAsc implements Comparator<ProductDetails> {

    @Override
    public int compare(ProductDetails o1, ProductDetails o2) {
	return o1.price - o2.price;
    }
}
