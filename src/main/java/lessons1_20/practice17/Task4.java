package lessons1_20.practice17;

// 4. Написать метод который возвращает true если строка имеет вид “null”

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task4 {
    public static void main(String[] args) {
        String str1 ="null";
        String str2="";
        System.out.println(isNull(str1));
        System.out.println(isNull(str2));
    }
    public static boolean isNull(String str) {
        Pattern pattern1 = Pattern.compile("^null$");
        Matcher matcher = pattern1.matcher(str);
        return matcher.matches();
    }
}
