package lesson35;
// Задача 2:
//Пользователь вводит строку с клавиатуры. Для каждого слова подсчитать частоту его
//встречаемости. Слова, отличающиеся регистром букв считать разными. Использовать
//класс HashMap. После выполнения результат вывести в консоль.

import java.util.HashMap;
import java.util.Scanner;

public class Practice_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = in.nextLine();
        String[] words = input.split(" ");
        HashMap <String, Integer >wordFrequencies = new HashMap<>();
        for (String word : words) {
            if (wordFrequencies.containsKey(word)) {
                wordFrequencies.put(word, wordFrequencies.get(word) + 1);
            } else {
                wordFrequencies.put(word, 1);
            }
        }
        // Output the results
        System.out.println("Word frequencies:");
        for (String word : wordFrequencies.keySet()) {
            System.out.println(word + ": " + wordFrequencies.get(word));
        }
    }
}