package lessons1_20.lesson6;

public class CreditCard {
    int accountNumber;
    int balance;

    public CreditCard(int i) {
        accountNumber=i;
        balance=10;

    }

    public CreditCard(int i, int m) {
        accountNumber=i;
        balance=m;
    }



    public String charge (int sum) {
        if (sum<=0) {
            return "incorrect input";
        } else {
            balance+=sum;
            return "successful, your balance is" + balance;
        }

    }
    public String withdraw (int sum) {
        if (sum<=0) {
            return "incorrect input";
        }
        if (sum>balance) {
            return "not enough money";
        }
        balance-=sum;
        return "successful, your balance is" + balance;
    }
    public String info () {

        return "your account number is " + accountNumber + ", your balance is " + balance;
    }

}
