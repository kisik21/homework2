package lesson29.ISP;

public class CircleImpl implements Circle {
    private double radius;
    public CircleImpl(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getRadius() {
        return radius;
    }
}