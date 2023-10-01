public class Display {
    public void showProductInfo(Product product) {
        if (product != null) {
            System.out.println("Product: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
        } else {
            System.out.println("Product not found");
        }
    }
}
