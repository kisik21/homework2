package lessons1_20.practice19;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
