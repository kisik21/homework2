package lessons1_20.homework14;

// Задача 4:
//Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//выводить сумму, переведенную сразу в доллары.

import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Consumer<String> convert = s -> {
            double amount = Double.parseDouble(s.split(" ")[0]);
            double exchangeRate = 3.30;
            double amountInUSD = amount / exchangeRate;
            System.out.println(amountInUSD +" USD");
        };
        convert.accept("999 BYN");
    }

}
