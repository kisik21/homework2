package lessons1_20.homework7;

public class Rectangle extends Figure {
    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }
}

