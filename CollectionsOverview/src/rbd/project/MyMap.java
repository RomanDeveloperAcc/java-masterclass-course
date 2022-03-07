package rbd.project;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted high level, object-oriented language");
        System.out.println(languages.put("Algol", "an algorithmic language"));
        languages.put("Lisp", "therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "this course is about Java"));

        }
        System.out.println(languages.get("Java"));

        System.out.println("====================================");

//        languages.remove("Lisp");

        if (languages.remove("Algol", "a family of languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }

        if (languages.replace("Lisp", "This will not work", "a functional programming language with some features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "not added"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
