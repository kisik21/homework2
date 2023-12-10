package lessons1_20.practice12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// Задача 1:
//Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
//пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
//все пробелы на знак нижнего подчеркивания.

public class Task1 {
    public static void main(String[] args) {
        File dir1 = new File("C://SomeDir");
        File file1 = new File(dir1, "TMS.txt");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String st1= in.nextLine();

        try (FileOutputStream fos = new FileOutputStream(file1)) {

            byte[] buffer = st1.getBytes() ;
            fos.write(buffer , 0, buffer.length);
            System.out.println( "The file has been written" );
        } catch (IOException ex) {
            System. out.println(ex.getMessage()) ;
        }


        try (FileInputStream fin = new FileInputStream(file1)) {
            int i;
            while ((i=fin.read()) !=-1) {
                if ((char) i==' ') {
                    System.out.print('_');
                } else {
                    System.out.print((char) i);
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
