package lessons1_20.homework13;

import java.util.Arrays;

// Задача 3:
//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе.
public class Task3 {
    public static void main(String[] args) {
        StudentCollection studentCollection = new StudentCollection();
        studentCollection.addStudent(new Student("Petr", "A", 1, Arrays.asList(4.0, 3.5, 3.0)));
        studentCollection.addStudent(new Student("Ivan", "A", 1, Arrays.asList(3.0, 3.5, 2.0)));
        studentCollection.addStudent(new Student("Oleg", "A", 1, Arrays.asList(5.0, 3.5, 4.0)));
        System.out.println("removing students with GPA lower than 3...");
        StudentCollection.removeBadStudents();
        System.out.println("transferring to the next course...");
        StudentCollection.transferStudentsToNextCourse();
        System.out.println("printing list of students on 2 course");
        StudentCollection.printStudents(studentCollection, 2);
    }
}
