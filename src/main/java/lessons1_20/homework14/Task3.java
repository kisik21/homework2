package lessons1_20.homework14;

import java.util.function.Function;

// Задача 3:
//Используя Function реализовать лямбду, которая будет принимать в себя строку в
//формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//возвращать сумму, переведенную сразу в доллары.
public class Task3 {
    public static void main(String[] args) {


        Function<String , String> convert = s -> {
            double amount = Double.parseDouble(s.split(" ")[0]);
            double exchangeRate = 3.30;
            double amountInUSD = amount / exchangeRate;
            return (amountInUSD) + " USD";
        };
        System.out.println(convert.apply("120 BYN"));
        System.out.println(convert.apply("660 BYN"));
    }
}

