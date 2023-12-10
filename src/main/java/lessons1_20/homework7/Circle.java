package lessons1_20.homework7;

public class Circle extends Figure{

    double r;
    Circle(double r) {
        this.r=r;
    }

    @Override
    public double area() {
        return 3.14*r*r;
    }

    @Override
    public double perimeter() {
        return 2*3.14*r;
    }


}
