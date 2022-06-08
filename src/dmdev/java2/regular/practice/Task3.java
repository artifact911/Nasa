package dmdev.java2.regular.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. у которых есть параметры, например <p id="p1">, и замену
 *     их на простые теги абзацев <p>.
 */
public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String raw = "<p id=\"2\"> erer </p> <T> ttern <pid='8'> eqweqc </p> <p>wrr <p id=\"p4\"> erer </p>";

        System.out.println(raw.replaceAll(regex, "<p>$2"));



    }
}
