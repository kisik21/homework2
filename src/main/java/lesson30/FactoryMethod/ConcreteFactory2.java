package lesson30.FactoryMethod;

public class ConcreteFactory2 implements Factory {
    @Override
    public Product createProduct() {
        return new Product2();
    }
}