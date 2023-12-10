package lessons1_20.practice12;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class Task3 {
    public static void main(String[] args) {
        File dir1 = new File("C://SomeDir");
        File file3 = new File(dir1, "testFile.txt");
        Student student= new Student("arthgfw", 123, 10);
        Student student2= new Student("refwedfwe", 124, 45);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file3));
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(student2);
            objectOutputStream.close();
        }
        catch(Exception e ) {
            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file3));
            Student studentRestored = (Student) objectInputStream.readObject();
            Student student2Restored = (Student) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(studentRestored.name);
            System.out.println(student2Restored.age);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
