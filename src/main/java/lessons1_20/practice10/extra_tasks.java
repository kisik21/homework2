package lessons1_20.practice10;

import java.util.Scanner;

public class extra_tasks {
    public static void main(String[] args) {
        // 1. Найти количество слов в строке(слова разделены пробелами)
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String: ");
        String st = sc.nextLine();
        String st1 = st.trim();
        int i;
        if (!st1.isEmpty()) {
            count += 1;
        }
        for (i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) == ' ' && st1.charAt(i + 1) != ' ') {
                count += 1;
            }
        }
        System.out.println("number of words is: " + count);

        // 2. Найти слово с минимальной длинной
        int min = st1.length();
        int t = 0;
        int index = 0;
        switch (count) {
            case 0:
                System.out.println("no words - no shortest word");
                break;
            case 1:
                System.out.println("shortest word has " + st1.length() + " chars," + "word is: " + st1);
                break;
            default:
                for (i = 0; i < st1.length(); i++) {
                    if (st1.charAt(i) != ' ') {
                        t += 1;
                        if (i == st1.length() - 1 && min > t) {
                            min = t;
                            index = i+1;
                        }
                    } else {
                        if (min > t) {
                            min = t;
                            index = i;
                        }
                        t = 0;
                    }

                }
                System.out.println("index: " + index + " min: " + min);
                System.out.println("shortest word has " + min + " chars," + "word is: " + st1.substring(index - min, index));
        }

    }
}





