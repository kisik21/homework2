package lesson30.Singleton;

// Singleton is a creational design pattern that lets you ensure
// that  a class has only one instance, while providing a global
// access point to this instance.
public class Task1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); // true
    }
}