package lessons1_20.homework13;

import java.util.List;
public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Double> subjectGrades;
    public Student(String name, String group, int course, List<Double> subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse() {
        this.course = course+1;
    }
    public List<Double> getSubjectGrades() {
        return subjectGrades;
    }
    public double getGPA() {
        double sum = 0;
        for (Double grade : subjectGrades) {
            sum += grade;
        }
        return sum / subjectGrades.size();
    }
}



