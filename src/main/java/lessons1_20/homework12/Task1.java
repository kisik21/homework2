package lessons1_20.homework12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

// Задача 1:
//В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
//Проанализировать и записать в другой файл самое длинное слово
public class Task1 {
    public static void main(String[] args) {
        String longestWord = "";
        File dir1 = new File("src/main/resources");
        File file = new File(dir1, "romeo-and-juliet.txt");
        File result = new File(dir1, "result.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length() && word.matches(".*[a-zA-Z].*")) {
                    longestWord = word;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        try (FileWriter fw = new FileWriter( result )) {
            fw.write(longestWord); // serving-creature's
            fw.flush() ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
