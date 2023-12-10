package lessons1_20.homework7;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{
    double a;
    double b;
    double c;
    Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double area() {
        double p=(a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }


}
