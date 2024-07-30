public class GiftWrappedProduct implements Product {
    private Product product;

    public GiftWrappedProduct(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " (Gift Wrapped)";
    }

    @Override
    public double getCost() {
        return product.getCost() + 5.00; // Suponha que o embrulho de presente custe $5.00
    }

    @Override
    public void prepare() {
        product.prepare();
        System.out.println("Adding gift wrap.");
    }
}
