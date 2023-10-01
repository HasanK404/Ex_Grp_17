public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        CashRegister cashRegister = new CashRegister();
        Display display = new Display();

        while (true) {
            int productID = keyboard.getProductID();
            if (productID == 0) {
                break;
            }

            Product product = cashRegister.findProductByID(productID);
            display.showProductInfo(product);
        }
    }
}
