package lessons1_20.homework14;

// Задача 5:
//Используя Supplier написать метод, который будет возвращать введенную с консоли
//строку задом наперед.
import java.util.Scanner;
import java.util.function.Supplier;
import java.lang.StringBuilder;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Supplier<String> supplier = () -> {
            System.out.println("enter a line: ");
            String str = in.nextLine();
            StringBuilder sb= new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        };
        System.out.println(supplier.get());

    }
}
