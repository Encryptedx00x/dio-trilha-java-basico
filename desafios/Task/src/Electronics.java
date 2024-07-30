public class Electronics implements Product {
    private String name;
    private double price;

    public Electronics(String name, double price) {
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
        // Implementação específica para Electronics
        System.out.println("Preparing electronics item: " + name);
    }
}
