package lessons1_20.homework13;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

// Задача 1:
//Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//При решении использовать коллекции.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a set of numbers, separated by commas and space (, ):");
        String input = in.nextLine();
        String[] numbers = input.split(", ");

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        try {
            for (String number : numbers) {
                uniqueNumbers.add(parseInt(number));
            }
            System.out.println("The unique numbers are:");
            System.out.println(uniqueNumbers);
        }
        catch (NumberFormatException e){
            System.out.println(" incorrect input");
        }





    }
}
