package lessons1_20.homework8;

import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input treatment plan: ");

        int plan = in.nextInt();
        Patient oleg = new Patient(plan);
        Therapist therapist = new Therapist();
        therapist.treat(oleg);
    }
}
