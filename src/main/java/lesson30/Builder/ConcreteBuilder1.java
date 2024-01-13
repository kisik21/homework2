package lesson30.Builder;

public class ConcreteBuilder1 implements Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.addPart("Part A");
    }
    @Override
    public void buildPartB() {
        product.addPart("Part B");
    }
    @Override
    public void buildPartC() {
        product.addPart("Part C");
    }
    @Override
    public Product getResult() {
        return product;
    }
}