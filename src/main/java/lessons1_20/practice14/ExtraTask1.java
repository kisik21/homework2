package lessons1_20.practice14;

import java.util.function.Function;

// Написать лямбда выражение, которое принимает на вход число и возвращает значение
// “Положительное число”, “Отрицательное число” или “Ноль”. Используем функциональный
// интерфейс Function.
public class ExtraTask1 {

    public static void main(String[] args) {

        Function<Double, String> positiveOrNegative = x -> {
                if (x>0) {
                    return "positive number";
                } else if (x<0) {
                    return "negative number";
                } else return "0";
        };
        System.out.println(positiveOrNegative.apply(5.8));
        System.out.println(positiveOrNegative.apply(-7.4));
        System.out.println(positiveOrNegative.apply(0.0));


    }

}
