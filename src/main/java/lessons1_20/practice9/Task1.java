package lessons1_20.practice9;
// Задача 1:
//Реализовать иерархию, показанную ниже, переопределить методы draw и erase в каждом
//из классов так, чтобы он выводил “I draw ”+ имя класса и “I erase ” + имя класса. Показать
//работу каждого из методов в main другого класса.
public class Task1 {
    public static void main(String[] args) {
        Shape c= new Circle();
        Shape s= new Square();
        Shape t= new Triangle();
        c.draw();
        c.erase();
        s.draw();
        s.erase();
        t.draw();
        t.erase();
    }
}
