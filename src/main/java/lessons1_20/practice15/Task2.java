package lessons1_20.practice15;

import java.util.ArrayList;

// Задача 2:
//При помощи стримов из списка строк вывести только те, которые начинаются с буквы ‘A’.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("str1");
        list.add("Astr2");
        list.add("Astr3");
        System.out.println(list.stream().filter(s-> s.startsWith("A")).toList());

    }

}
