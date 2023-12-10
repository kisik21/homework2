package lessons1_20.lesson5;

import java.util.Scanner;
import java.util.Random;
public class homework5_t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
        //Формат входных данных:
        //Программа получает на вход два числа n и m.
        //Формат выходных данных:
        //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        //символа.
        int n;
        do {
            System.out.println("enter number of rows: ");
            n = in.nextInt();
            if (n<1) {
                System.out.println("incorrect input");
            }
        } while (n < 1);
        int m;
        do {
            System.out.println("enter number of columns: ");
            m = in.nextInt();
            if (m<1) {
                System.out.println("incorrect input");
            }
        } while (m < 1);
        int[][] myArray = new int [n][m];
        int i;
        int j;
        Random random = new Random();
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++) {
                myArray[i][j]=random.nextInt(130)+1;
            }
        }
        // стандартный вывод
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // вывод змейкой, отводя на вывод каждого числа ровно 3 символа. (возможно говнокод)
        for (i=0; i<n; i++) {
            if (i%2==0) {
                for (j=0; j<m; j++) {
                    if (myArray[i][j]>999) {
                        do {
                            myArray[i][j]/=10;
                        }while (myArray[i][j]>999);
                        System.out.print(myArray[i][j]);
                    } else if (myArray[i][j]>99 ) {
                        System.out.print(myArray[i][j]);
                    } else if (myArray[i][j]>9 ) {
                        System.out.print(" " + myArray[i][j]);
                    } else if (myArray[i][j]>0 ) {
                        System.out.print("  " + myArray[i][j]);
                    }
                }
                System.out.println();
            } else {
                for (j=m-1; j>=0; j--) {
                    if (myArray[i][j]>999) {
                        do {
                            myArray[i][j]/=10;
                        }while (myArray[i][j]>999);
                        System.out.print(myArray[i][j]);
                    } else if (myArray[i][j]>99 ) {
                        System.out.print(myArray[i][j]);
                    } else if (myArray[i][j]>9 ) {
                        System.out.print(" " + myArray[i][j]);
                    } else if (myArray[i][j]>0 ) {
                        System.out.print("  " + myArray[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}
