package rbd.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String str1 = "I am I will";
        System.out.println(str1);
        String str2 = str1.replaceAll("I", "You");
        System.out.println(str2);

        String alphanumeric = "absssAsDasd1232312341asd";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("^absa", "Y"));

        System.out.println(alphanumeric.matches("^absa")); // matches should check full string

        System.out.println(alphanumeric.replaceAll("[0-9]", "X")); // [0-9] == \\d
        System.out.println(alphanumeric.replaceAll("(?i)[a-f]", "X")); // ignores case sensitivity

        System.out.println(alphanumeric.replaceAll("\\D", "Y")); // all non-digits

        String spaces = "There are spaces and \ttab";

        System.out.println(spaces);
        System.out.println(spaces.replaceAll("\\s", "")); // will remove spaces and tabs
        System.out.println(spaces.replaceAll("\t", "")); // will remove tabs
        System.out.println(spaces.replaceAll("\\S", "")); // will remove non-whitespace characters
        System.out.println(alphanumeric.replaceAll("\\w", "X")); // will replace all non-whitespace characters
        System.out.println(spaces.replaceAll("\\w", "X")); // will replace all non-whitespace characters


        System.out.println(spaces.replaceAll("\\b", "X")); // will add characters at the start and the end of the word\char

        System.out.println(alphanumeric.replaceAll("^abs{3}", "YYY")); // 3 's'
        System.out.println(alphanumeric.replaceAll("^abs+", "YYY")); // 1 or more 's'

        System.out.println(alphanumeric.replaceAll("^abs*", "YYY")); // 0 or more 's'
        System.out.println(alphanumeric.replaceAll("^abs{2,5}", "YYY")); // 2-5 's'

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Subheading</h2>");
        htmlText.append("<p>Just a p</p>");
        htmlText.append("<h2>Some other subheading</h2>");
        htmlText.append("<p>Just a second p</p>");

//        String h2pattern = ".*<h2>.*"; // anything before and anything after h2 tag
        String h2pattern = "(<h2>.*?</h2>)"; // group
        Pattern pattern = Pattern.compile(h2pattern);
        Matcher matcher = pattern.matcher(htmlText);

        System.out.println(matcher.matches());

        matcher.reset();

        int count = 0;

        while (matcher.find()) {
            count++;

            System.out.println("Occurance " + count + " starts at " + matcher.start() + " and ends at " + matcher.end());
        }
    }
}
