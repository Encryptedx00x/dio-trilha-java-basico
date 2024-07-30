public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("Electronics")) {
            return new Electronics("Default Electronics", 100.00);
        } else if (type.equalsIgnoreCase("Clothing")) {
            return new Clothing("Default Clothing", 50.00);
        }
        return null;
    }
}
