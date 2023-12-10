package lessons1_20.practice14;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

// Задача 1:
//Написать программу для вывода на консоль названия дня недели по введенной дате.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=in.nextInt();
        System.out.println("Enter month: ");
        int month=in.nextInt();
        System.out.println("Enter day: ");
        int day=in.nextInt();
        LocalDate date =LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek=date.getDayOfWeek();
        System.out.println("Day of week is: " + dayOfWeek);
    }
}
