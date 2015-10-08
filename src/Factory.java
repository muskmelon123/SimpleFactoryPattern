public class Factory {
	public static Product getProduct(String type) {
		Product product = null;
		if (type == "A") {
			product = new ProductA();
			return product;
		} else if (type == "B") {
			product = new ProductB();
			return product;
		}
		return product;
	}
}
