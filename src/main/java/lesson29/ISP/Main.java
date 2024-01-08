package lesson29.ISP;



public class Main {
    public static void main(String[] args) {
        Shape rectangle = new RectangleImpl(5, 10);
        Shape circle = new CircleImpl(5);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
    }
}