package lessons1_20.homework7;

public class Accountant implements JobTitle {
    String jobTitle="accountant";
    Accountant () {

    }

    @Override
    public void print() {
        System.out.println("job title is: " + jobTitle );
    }
}
