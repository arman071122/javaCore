package week9;

import java.util.Comparator;

public class ProIdAsc implements Comparator<ProductDetails> {

    @Override
    public int compare(ProductDetails o1, ProductDetails o2) {
	return o1.id - o2.id;
    }
}
