package lesson30.FactoryMethod;

public class ConcreteFactory1 implements Factory {
    @Override
    public Product createProduct() {
        return new Product1();
    }
}