package lessons1_20.practice14;

import java.time.DayOfWeek;
import java.time.LocalDate;

// Задача 2:
//Написать программу для вывода на экран дату следующего вторника
public class Task2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        int t;
        switch (dayOfWeek) {
            case MONDAY -> t=1;
            case TUESDAY -> t=7;
            case WEDNESDAY -> t=6;
            case THURSDAY -> t=5;
            case FRIDAY -> t=4;
            case SATURDAY -> t=3;
            case SUNDAY -> t=2;
            default -> throw new IllegalStateException("Unexpected value: " + dayOfWeek);
        }
        System.out.println("next tuesday is : " + localDate.plusDays(t));



    }
}
