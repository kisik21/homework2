package lessons1_20.lesson4;

import java.util.Scanner;
import java.lang.Math;
public class practice4 {
    public static void main(String[] args) {

        int i;
        for (i = 0; i < 5; i++) {
            double r = Math.random();
            System.out.print(Math.pow(r, 2) + " ");
        }
        System.out.println();

        String[] fruits = new String[]{"banana", "kiwi", "pineapple", "mango"};
        System.out.println(fruits[1] + " " + fruits[3]);
        System.out.println("size of array is: " + fruits.length);
        fruits[2] = "apple";
        System.out.println(fruits[2]);

        Scanner in = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = in.nextInt();
        double[] masDouble = new double[n];
        for (i = 0; i < n; i++) {
            masDouble[i] = 5 * Math.random();
            System.out.print(masDouble[i] + " ");
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            if (i%2!=0) {
                masDouble[i] *= masDouble[i];
            }
            System.out.print(masDouble[i] + " ");
        }
        System.out.println();
        for (i=n-1; i>=0; i--) {
            System.out.print(masDouble[i] + " ");
        }
        System.out.println();
        int[] masInt = new int[12];
        for (i=0; i<12; i++) {
            masInt[i]=(int) (30*Math.random()-15);
        }
        for (i=0; i<12; i++) {
            System.out.print(masInt[i] + " ");
        }
        System.out.println();
        int max=masInt[0];
        int k=0;
        for (i=0; i<12; i++) {
            if (masInt[i]>=max) {
               k=i;
                max=masInt[i];
            }
        }
        System.out.println("index of last occurrence " + k);

        String[] masString = new String[36];
        masString[0]="2*2"; masString[1]="2*3"; masString[2]="2*4"; masString[3]="2*5"; masString[4]="2*6"; masString[5]="2*7"; masString[6]="2*8"; masString[7]="2*9"; masString[8]="3*3"; masString[9]="3*4"; masString[10]="3*5"; masString[11]="3*6"; masString[12]="3*7"; masString[13]="3*8"; masString[14]="3*9"; masString[15]="4*4"; masString[16]="4*5"; masString[17]="4*6"; masString[18]="4*7"; masString[19]="4*8"; masString[20]="4*9"; masString[21]="5*5"; masString[22]="5*6"; masString[23]="5*7"; masString[24]="5*8"; masString[25]="5*9"; masString[26]="6*6"; masString[27]="6*7"; masString[28]="6*8"; masString[29]="6*9"; masString[30]="7*7"; masString[31]="7*8"; masString[32]="7*9"; masString[33]="8*8"; masString[34]="8*9"; masString[35]="9*9";
        int p= (int) (36*Math.random());
        for (i=0;i<15;i++) {
            int t=(i+p)%36;
            System.out.println(masString[t]);
        }
    }
}
