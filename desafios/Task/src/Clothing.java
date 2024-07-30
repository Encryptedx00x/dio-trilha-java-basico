public class Clothing implements Product {
    private String name;
    private double price;

    public Clothing(String name, double price) {
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
        // Implementação específica para Clothing
        System.out.println("Preparing clothing item: " + name);
    }
}
