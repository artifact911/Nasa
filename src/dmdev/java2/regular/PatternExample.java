package dmdev.java2.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher("123");
        System.out.println(matcher.matches());

        String phoneNumber = "+375 (29) 898-12-13";
        String regex = "(\\+375)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}";
//        Pattern pattern1 = Pattern.compile("\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}");
        // поправим
        // ? говорит, что символа(-ов если взять их в скобки) может не быть
        Pattern pattern1 = Pattern.compile("(\\+375)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher1 = pattern1.matcher(phoneNumber);
        System.out.println(matcher1.matches());

        // упрощение вариант 2
        System.out.println(Pattern.matches(regex, phoneNumber));

        // упрощение вариант 3
        System.out.println(phoneNumber.matches(regex));
    }
}
