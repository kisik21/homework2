package lessons1_20.practice17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 2. Написать метод который сможет заменить КАЖДУЮ букву на знак & в строке из 1
//задания.
public class Task2 {
    public static void main(String[] args) {
        String str="Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        Pattern pattern1= Pattern.compile("[A-Za-z]");
        Matcher matcher=pattern1.matcher(str);
        System.out.println(matcher.replaceAll("&"));
    }
}
