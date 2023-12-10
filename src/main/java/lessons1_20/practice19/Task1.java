package lessons1_20.practice19;

// Задача 1:
//Используя класс Thread создать поток Child который выводит числа от 1 до 100. В методе
//main первой строкой вывести в консоль “Поток main начинает свою работу” затем создать
//объект Child и запустить поток. Затем на последней строке метода main вывести в
//консоль “Поток main завершает свою работу”. Посмотреть результат и сделать вывод.

public class Task1 {
    public static void main(String[] args) {
        System.out.println("main thread starts working");
        Child child=new Child();
        child.start();
        System.out.println("main thread ends working"); // main ends working before child
    }
}
