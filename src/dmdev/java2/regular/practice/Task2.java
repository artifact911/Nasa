package dmdev.java2.regular.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Написать прогорамму, выполняющую поиск в строке шестнадцатиричных чисел, записаных по правилам Java, с помощью регулярных выражений и
 *     выводящую их на страницу.
 */
public class Task2 {

    public static void main(String[] args) {
        String regex = "0[Xx][0-9a-fA-F]+";

        String input = "dadwedw 0xFFdxwecwec 0x12 cccee 0XAB dscew 1X24F ewfw 0xT2";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
