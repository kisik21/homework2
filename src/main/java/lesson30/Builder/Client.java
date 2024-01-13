package lesson30.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();
        Director director = new Director(builder1);
        Director dir = new Director(builder2);
        Product product = director.construct();
        Product anotherProduct = dir.construct();
        System.out.println(product);
        System.out.println(anotherProduct);
    }
}