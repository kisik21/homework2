package lessons1_20.practice13;


import java.util.ArrayList;

//Задача 1:
//        1.1 Создать коллекцию ArrayList стран мира.
//        1.2 Добавить к этому cписку 3 страны, вывести результат в консоль.
//        1.3 Заменить 2-й элемент.
//        1.4 Удалить его по индексу.
//        1.5 Удалить любой элемент по значению.
//        1.6 Узнать индекс любого элемента.
//        1.7 Проверить, содержится ли элемент в коллекции (любой).
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add( "Belarus");
        list.add( "Kazakhstan");
        list.add( "Columbia");
        list.add( "Sweden");
        list.add( "Turkey");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Размер массива " + list.size());
        list.set( 1, "China");

        list.remove( 1);

        list.remove("Belarus");

        int index = list.indexOf( "Turkey");
        System.out.println("index of Turkey is: " + index);
        System.out.println(list.contains( "Sweden"));
    }
}
