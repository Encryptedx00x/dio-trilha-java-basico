public class Main {
    public static void main(String[] args) {
        // Singleton
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
        
        // Factory Method
        Product product1 = ProductFactory.createProduct("Electronics");
        // Aqui não deve haver métodos prepare(), getName() e getPrice() no Product
        // Produto simulado, então adapte-se a uma implementação de exemplo
        if (product1 != null) {
            System.out.println(product1.getDescription() + " - $" + product1.getCost());
        }
        
        Product product2 = ProductFactory.createProduct("Clothing");
        if (product2 != null) {
            System.out.println(product2.getDescription() + " - $" + product2.getCost());
        }
        
        // Observer
        Order order = new Order();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        
        order.addObserver(customer1);
        order.addObserver(customer2);
        
        order.setStatus("Shipped");
        
        // Decorator
        Product basicProduct = new BasicProduct("Laptop", 899.99);
        Product giftWrappedProduct = new GiftWrappedProduct(basicProduct);
        Product insuredProduct = new InsuredProduct(giftWrappedProduct);
        
        System.out.println(insuredProduct.getDescription() + " - $" + insuredProduct.getCost());
        
        dbConnection.disconnect();
    }
}
