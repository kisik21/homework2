package lesson35;

// Задача 1:
//На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
//строка является ключом, и ее значение равно true, если эта строка встречается в массиве
//2 или более раз. Пример:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}

import java.util.HashMap;
import java.util.Map;

public class Homework_task1 {
    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }

        return resultMap;
    }


}
