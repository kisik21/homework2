package lessons1_20.homework10;
// 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
//найденные строки и их длину.
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] arrayStr = new String[3];
        int i;
        for (i=0; i<3; i++) {
            System.out.println("enter string " + (i+1) +":");
            arrayStr[i]=in.nextLine();
        }
        int max=0;
        int min=arrayStr[0].length();
        int indexMin=0;
        int indexMax=0;
        for (i=0; i<3; i++) {
            if (arrayStr[i].length()>max) {
                indexMax=i;
                max=arrayStr[i].length();
            }
            if (arrayStr[i].length()<min) {
                indexMin=i;
                min=arrayStr[i].length();
            }
        }
        System.out.println("shortest string is " + min + " chars long, string is: " + arrayStr[indexMin]);
        System.out.println("longest string is " + max + " chars long, string is: " + arrayStr[indexMax]);

    }
}
