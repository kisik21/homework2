package lesson35;

// Задача 2:
//На вход поступает массив непустых строк, создайте и верните Map<String,
//String> следующим образом: для каждой строки добавьте ее первый символ в
//качестве ключа с последним символом в качестве значения. Пример:
//pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//pairs(["man", "moon", "main"]) → {"m": "n"}
//pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

import java.util.HashMap;
import java.util.Map;

public class Homework_task2 {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            if (!str.isEmpty()) {
                result.put(str.substring(0, 1), str.substring(str.length() - 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));
    }
}
