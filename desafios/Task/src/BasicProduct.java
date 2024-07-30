public class BasicProduct implements Product {
    private String name;
    private double price;

    public BasicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public void prepare() {
        // Implementação específica para BasicProduct
        System.out.println("Preparing basic product: " + name);
    }
}
