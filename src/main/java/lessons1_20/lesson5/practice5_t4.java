package lessons1_20.lesson5;

import java.util.Scanner;
import java.util.Random;
public class practice5_t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Вывести на экран матрицу m*n вида:
        //
        //4, 3, 2, 1
        //8, 7, 6, 5,
        //12,11,10, 9
        //
        //те же условия, вывести матрицу вида
        //-----------
        //1, 4, 7
        //2, 5, 8
        //3, 6, 9
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
        System.out.println();
        for (i=0; i<m; i++) {
            for (j=n-1; j>=0; j--) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (j=0; j<n; j++) {
            for (i=0; i<m; i++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}