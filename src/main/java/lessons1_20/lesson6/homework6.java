package lessons1_20.lesson6;
import java.util.Scanner;
public class homework6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CreditCard card1 = new CreditCard(3414, 140);
        CreditCard card2 = new CreditCard(3470, 21);
        CreditCard card3 = new CreditCard(3453, 333);

        card1.charge(20);
        card2.charge(9);
        card3.withdraw(33);

        System.out.println(card1.info());
        System.out.println(card2.info());
        System.out.println(card3.info());

    }
}
