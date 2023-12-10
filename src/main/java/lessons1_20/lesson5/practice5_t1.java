package lessons1_20.lesson5;

import java.util.Scanner;
import java.util.Random;
public class practice5_t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Создайте двумерный массив и заполните его псевдослучайными числами с помощью
        //класса Random.
        int m;
        do {
            System.out.println("enter number of rows: ");
            m = in.nextInt();
            if (m<1) {
            System.out.println("incorrect input");
            }
        } while (m < 1);
        int n;
        do {
            System.out.println("enter number of columns: ");
            n = in.nextInt();
            if (n<1) {
                System.out.println("incorrect input");
            }
        } while (n < 1);
        int[][] myArray = new int [m][n];
        int i;
        int j;
        Random random = new Random();
        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                myArray[i][j]=random.nextInt(100)+1;
            }
        }

        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        // Найдите максимальное значение в созданном 2-мерном массиве
        int max=myArray[0][0];
        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                if (myArray[i][j]>max) {
                    max=myArray[i][j];
                }
            }
        }
        System.out.println("max element of array is: " + max);
    }
}
