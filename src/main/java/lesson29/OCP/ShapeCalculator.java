package lesson29.OCP;

import java.util.ArrayList;
import java.util.List;

//  Open-Closed Principle  states that classes, modules, functions, etc.
//  should be open for extension, but closed for modification.
class ShapeCalculator {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5, 3);
        Circle c1=new Circle(4);
        List<Shape> shapes=new ArrayList<>();
        shapes.add(r1);
        shapes.add(c1);
        System.out.println(calculateTotalArea(shapes));
    }
    public static double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }




}