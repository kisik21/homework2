package lesson31.Decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape coloredCircle = new ColoredShape(circle, "red");
        coloredCircle.draw();
    }
}