package atr.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\d+)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        printer(m);

        String pattern2 = "^This";
        r = Pattern.compile(pattern2);
        m = r.matcher(line);
        printer(m);

        String pattern3 = "(order)[was]";
        r = Pattern.compile(pattern3);
        m = r.matcher(line);
        printer(m);
    }

    private static void printer(Matcher m) {
//        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0));
//        }else {
//            System.out.println("NO MATCH");
//        }
        while (m.find()) {
            System.out.println("Found value: " + m.group(0));
        }
    }
}
