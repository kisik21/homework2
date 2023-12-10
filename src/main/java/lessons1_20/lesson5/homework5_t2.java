package lessons1_20.lesson5;
public class homework5_t2 {
    public static void main(String[] args) {
        // Создать программу для раскраски шахматной доски с помощью цикла. Создать
        //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        //B(Black) или W(White). При выводе результат работы программы должен быть
        //teachmeskills.by
        //следующим:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        String [][] masBoard = new String [8][8];
        int i;
        int j;
        for (i=0; i<8; i++) {
            for (j=0; j<8; j++) {
                if ((i+j)%2==0) {
                    masBoard [i][j]="W";
                } else {
                    masBoard [i][j]="B";
                }
            }
        }
        for (i=0; i<8; i++) {
            for (j=0; j<8; j++) {
                System.out.print(masBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // второй способ
        boolean t=false;
        for (i=0; i<8; i++) {
            for (j=0; j<8; j++) {
                if (!t) {
                    masBoard[i][j] = "W";
                    t = true;
                } else {
                    masBoard[i][j] = "B";
                    t = false;
                }
            }
            t=!t;
        }

        for (i=0; i<8; i++) {
            for (j=0; j<8; j++) {
                System.out.print(masBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
