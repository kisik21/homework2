package lessons1_20.lesson5;

import java.util.Scanner;
import java.util.Random;
public class practice5_t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Найдите сумму элементов на главной и побочной диагонали
        int m;
        do {
            System.out.println("enter size of array: ");
            m = in.nextInt();
            if (m<1) {
                System.out.println("incorrect input");
            }
        } while (m < 1);

        int[][] myArray = new int [m][m];
        int i;
        int j;
        Random random = new Random();
        for (i=0; i<m; i++) {
            for (j=0; j<m; j++) {
                myArray[i][j]=random.nextInt(100)+1;
            }
        }

        for (i=0; i<m; i++) {
            for (j=0; j<m; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        int sum=0;
        for (i=0; i<m; i++) {
            for (j=0; j<m; j++) {
                if (i == j) {
                    sum+=myArray[i][j];
                }
            }
        }
        int sum2=0;
        for (i=0; i<m; i++) {
            for (j=0; j<m; j++) {
                if (i == m-j-1) {
                    sum2+=myArray[i][j];
                }
            }
        }
        System.out.println("sum of elements on main diagonal: " + sum);
        System.out.println("sum of elements on side diagonal: " + sum2);

    }
}