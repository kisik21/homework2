package lessons1_20.homework7;

// Задача 2: Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве.
public class homework7_task2 {
    public static void main(String[] args) {
        Figure[] figureArray = new Figure[5];
        //Figure[] figureArray = new Figure[] {new Circle(5), new Triangle(7, 5, 8), new Rectangle(7, 4), new Circle(5), new Triangle(5, 4, 3)};
        figureArray[0]= new Circle(5);
        figureArray[1]= new Triangle(7, 5, 8);
        figureArray[2]= new Rectangle(7, 4);
        figureArray[3]= new Circle(9);
        figureArray[4]= new Triangle(5, 4, 3);

        double sum=0;
        int i;
        for (i=0; i<5; i++) {
            sum+=figureArray[i].perimeter();
        }
        System.out.println("sum of perimeters is:" + sum);


    }


}
