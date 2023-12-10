package lessons1_20.homework17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Задача 1:
//Вывести в консоль из строки которую пользователь вводит с клавиатуры все
//аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
//только из прописных букв, без чисел.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input= in.nextLine();
        Pattern pattern = Pattern.compile("(?<=\\s|^)[A-Z]{2,6}+(?=$|[\\s.,?!])"); //  "\\b[A-Z]{2,6}\\b"
        Matcher matcher = pattern.matcher(input);
        System.out.println("abbreviations in entered line :");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
