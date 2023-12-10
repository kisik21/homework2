package lessons1_20.practice13;

//Задача 3:
//        3.1 Создать класс Person.
//        3.2 Создать HashSet в классе Main.
//        3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.
//        3.4 Удалить 2 объекта из коллекции.
//        3.5 Проверить, содержится ли оставшийся объект в коллекции.

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        HashSet<Person> h = new HashSet<>();
        Person person1 =new Person("Stas", 20);
        Person person2 =new Person("Oleg", 25);
        Person person3 =new Person("Ian", 30);
        h.add(person1);
        h.add(person2);
        h.add(person3);
        System.out.println(h);
    }
}
