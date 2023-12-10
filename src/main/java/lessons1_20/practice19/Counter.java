package lessons1_20.practice19;

public class Counter {

    int count;
    int increase() {
        this.count+=1;
        return count;
    }
    void setCount(int i) {
        this.count=i;
    }

    int getCount() {
        return this.count;
    }
}
