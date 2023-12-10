package lessons1_20.practice13;


import java.util.LinkedList;

//Задача 2:
//        2.1 Создать двусвязный список стран мира.
//        2.2 Добавить к этому списку 4 страны ( 2 в начало и 2 в конец), вывести результат в
//        консоль (Использовать методы addFirst/addLast).
//        2.3 Удалить по одному элементу из начала и из конца списка.
//        2.4 Получить по одному элементу из начала и из конца списка.
public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Japan");
        list.addFirst("Mongolia");
        list.addLast("Kenya");
        list.addLast("Egypt");
        for (String s : list) {
            System.out.println(s);
        }
        list.removeFirst();
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
