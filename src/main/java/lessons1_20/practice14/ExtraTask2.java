package lessons1_20.practice14;

import java.util.function.Predicate;

// Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
// и заканчивается “A”. Используем функциональный интерфейс Predicate
public class ExtraTask2 {
    public static void main(String[] args) {
        Predicate<String> predicateJ = str -> str.startsWith("J");
        Predicate<String> predicateN = str -> str.startsWith("N");
        Predicate<String> predicateA = str -> str.endsWith("A");
        Predicate<String> predicate = predicateJ.or(predicateN).and(predicateA);

        System.out.println(predicate.test("jja"));
        System.out.println(predicate.test("no"));
        System.out.println(predicate.test("JJA"));
    }
}
