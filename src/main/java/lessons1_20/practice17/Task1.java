package lessons1_20.practice17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 1. Написать метод который сможет вернуть все цифры из строки:
//“Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”.
public class Task1 {
    public static void main(String[] args) {
        String str="Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        Pattern pattern1= Pattern.compile("-?[0-9]+(.[0-9]+)?");
        Matcher matcher=pattern1.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
