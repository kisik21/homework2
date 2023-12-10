package lessons1_20.lesson5;

import java.util.Scanner;
public class practice5_t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Дан массив из символов и пробелов. Заменить все пробелы на последовательность
        // символов '%', '2', '0' . Порядок сохранить, в массиве достаточно места, чтобы
        // все вместилось. Вернуть конечную длину массива и сам массив изменить, не делать новый.


        char[] myArray = new char [10];
        myArray[0]='c';
        myArray[1]=' ';
        myArray[2]='a';
        int i;
        for (i=0; i<10; i++) {

            System.out.print(myArray[i]);
        }

    }
}
