package lesson31.Decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        Component decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        Component decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();
    }
}