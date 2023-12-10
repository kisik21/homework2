package lessons1_20.practice16;

// Задача 2:
//Создать рекорд Person с полями. Создать объект рекорда Person.
public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("ee", 35);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
