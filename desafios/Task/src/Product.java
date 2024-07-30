public interface Product {
    String getDescription();
    double getCost();
    void prepare(); // As classes que implementam Product devem fornecer uma implementação para este método
}
