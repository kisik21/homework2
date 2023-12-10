package lessons1_20.practice11;
// Создать собственное исключение которое будет выбрасываться в классе Person при
//создании объекта, если ему меньше 18 лет. Попробовать создать объект Person до и
//после 18 лет в методе main.
public class Task2 {

    public static void main(String[] args) {

        try {
            Person s= new Person(25, "Stas");
            System.out.println("object 1 created");
            Person o= new Person(10, "Oleg");
        }
        catch (TooYoung e) {
            System.out.println(e);
        }
    }
}
