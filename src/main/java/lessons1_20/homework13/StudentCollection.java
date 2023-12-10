package lessons1_20.homework13;

import java.util.ArrayList;
import java.util.List;

public class StudentCollection {
    private static final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public static void removeBadStudents() {
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getGPA() < 3) {
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);
    }
    public static void transferStudentsToNextCourse() {
        for (Student student : students) {
            if (student.getGPA() >= 3) {
                student.setCourse();
            }
        }
    }
    public static void printStudents(StudentCollection studentCollection, int course) {
        for (Student student : students) {
            if (student.getCourse()==(course)) {
                System.out.println(student.getName());
            }
        }
    }
}
