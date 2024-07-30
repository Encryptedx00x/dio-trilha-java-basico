public class InsuredProduct implements Product {
    private Product product;

    public InsuredProduct(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " (Insured)";
    }

    @Override
    public double getCost() {
        return product.getCost() + 10.00; // Suponha que o seguro custe $10.00
    }

    @Override
    public void prepare() {
        product.prepare();
        System.out.println("Adding insurance.");
    }
}
