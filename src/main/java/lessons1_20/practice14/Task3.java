package lessons1_20.practice14;

// Задача 3:
//Создать интерфейс IShape с методом getSquare(int x, int y). Используя лямбда-
//выражения, реализовать его для квадрата(a*b) и треугольника(0.5a*h).
public class Task3 {
    public static void main(String[] args) {
        IShape square;
        square = (x, y) ->x*y;
        IShape triangle;
        triangle = (x, y) -> (double) (x * y) /2;
        double result1=square.getSquare(10, 5);
        double result2= triangle.getSquare(5,3);
        System.out.println("result 1: " + result1 + ", result 2: " + result2);
    }
}
