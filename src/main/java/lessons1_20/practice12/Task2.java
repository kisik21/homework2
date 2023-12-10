package lessons1_20.practice12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// Задача 2:
//Используя FileReader и FileWriter сначала записать в файл tms2.txt фразу на латыни
//“Cognosce te ipsum”, а затем считать ее и вывести в консоль первую букву.
public class Task2 {
    public static void main(String[] args) {
        String st ="Cognosce te ipsum";
        File dir1 = new File("C://SomeDir");
        File file2 = new File(dir1, "TMS2.txt");

        try (FileWriter fw = new FileWriter( file2 )) {
            fw.write(st);
            fw.flush() ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (FileReader fr = new FileReader( file2 )) {
            int i= fr.read();
            System.out.print((char) i);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
