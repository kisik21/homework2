package lessons1_20.homework7;

public class Worker implements JobTitle {

    String jobTitle="worker";

    Worker () {

    }
    @Override
    public void print() {
        System.out.println("job title is: " + jobTitle);
    }
}
