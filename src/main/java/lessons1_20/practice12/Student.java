package lessons1_20.practice12;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int group;
    int age;
    Student (String name, int group, int age) {
        this.name=name;
        this.group=group;
        this.age=age;
    }
}
