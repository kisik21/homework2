package lessons1_20.homework14;


import java.time.LocalDate;
import java.util.Scanner;

// Задача 1:
//Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//когда пользователю исполнится 100 лет. Использовать Date/Time API.
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
        LocalDate date100Years=date.plusYears(100);
        System.out.println("User will be 100 years old on: " + date100Years);
    }
}

