package lessons1_20.lesson5;

import java.util.Scanner;
public class practice5_t2 {
    public static void main(String[] args) {
        // Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.
        Scanner in = new Scanner(System.in);
        int[][] zyb = new int [3][];
        int a;
        int i;
        for (i=0; i<3; i++) {
            System.out.println("number of elements in row " + i + ":");
            a = in.nextInt();
            zyb[i]= new int[a];
        }
        int sum=0;
        for (i=0; i<3; i++) {
            sum+=zyb[i].length;
        }
        System.out.println("number of elements in zyb array: " + sum);
    }
}