package lessons1_20.practice9;

import static lessons1_20.practice9.Person.printName;

public class Task2 {
    public static void main(String[] args) {
        printName();  // Person.printName(); , тогда импорт не нужен
        System.out.println(Person.name);

    }
}
