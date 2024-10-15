package week9;

public class ProductDetails {
    String name;
    int price, id;

    public ProductDetails(String name, int id, int price) {
	this.name = name;
	this.id = id;
	this.price = price;
    }

    @Override
    public String toString() {
	return "[name=" + name + ", price=" + price + ", id=" + id + "]";
    }
}
