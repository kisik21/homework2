package lessons1_20.homework7;
//Задача 1:Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//который печатает название должности и имплементировать этот метод в созданные классы.
public class homework7_task1 {

    public static void main(String[] args) {
        Worker w= new Worker();
        Director d= new Director();
        Accountant a= new Accountant();

        w.print();
        d.print();
        a.print();



    }



}
