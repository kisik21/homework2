package lesson29.ISP;

public class RectangleImpl implements Rectangle {
    private double width;
    private double height;
    public RectangleImpl(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public double getWidth() {
        return width;
    }
}