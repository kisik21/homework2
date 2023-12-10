package lessons1_20.lesson5;

import java.util.Scanner;
import java.util.Random;
public class homework5_t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Создать двумерный массив, заполнить его случайными числами
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
                myArray[i][j]=random.nextInt(30)+1;
            }
        }

        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        // Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        // Найти сумму всех получившихся элементов и вывести в консоль.
        System.out.println("enter number to add to every element ");
        int x = in.nextInt();
        int sum=0;
        for (i=0; i<m; i++) {
            for (j=0; j<n; j++) {
                myArray[i][j]+=x;
                sum+=myArray[i][j];
            }
        }
        System.out.println("sum of elements after number added: " + sum);
    }

}
