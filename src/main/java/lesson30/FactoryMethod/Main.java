package lesson30.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        Product product = factory.createProduct();
        // Use the product
        product.doSomething();
    }
}