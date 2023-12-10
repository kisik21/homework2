package lessons1_20.practice19;

public class CounterThread implements Runnable{

    CounterThread(Counter counter) {
        this.counter=counter;
    }
    Counter counter;
    @Override
    public void run() {
        synchronized (counter) {
            counter.setCount(1);
            for (int i = 0; i < 4; i++) {
                System.out.println(counter.getCount());
                counter.increase();
            }
        }
    }
}
