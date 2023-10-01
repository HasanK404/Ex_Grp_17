import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CashRegister {
    private Map<Integer, Product> products;

    public CashRegister() {
        products = new HashMap<>();
        loadProductsFromFile("products.txt");
    }

    private void loadProductsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    products.put(id, new Product(name, price));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Product findProductByID(int id) {
        return products.get(id);
    }
}
