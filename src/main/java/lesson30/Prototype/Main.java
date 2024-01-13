package lesson30.Prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype1 = new Prototype("Oleg", 25);
        Prototype prototype2 = prototype1.clone();
        System.out.println(prototype2.getName());
        System.out.println(prototype2.getAge());
    }
}
