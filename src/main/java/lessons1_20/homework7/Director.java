package lessons1_20.homework7;

public class Director implements JobTitle {

    String jobTitle="director";

    Director () {

    }
    @Override
    public void print() {
        System.out.println("job title is: " + jobTitle);
    }

}
