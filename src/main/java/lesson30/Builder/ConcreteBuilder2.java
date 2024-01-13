package lesson30.Builder;

public class ConcreteBuilder2 implements Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.addPart("Part X");
    }
    @Override
    public void buildPartB() {
        product.addPart("Part Y");
    }
    @Override
    public void buildPartC() {
        product.addPart("Part Z");
    }
    @Override
    public Product getResult() {
        return product;
    }
}