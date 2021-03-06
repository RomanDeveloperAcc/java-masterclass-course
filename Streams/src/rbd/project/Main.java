package rbd.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<String> someBingoNumbers = Arrays.asList("N40", "N36", "B12", "B56", "G53", "G49", "g13", "071");

	    List<String> gNumbers = new ArrayList<>();

//	    someBingoNumbers.forEach(number -> {
//	        if (number.toUpperCase().startsWith("G")) {
//	            gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//	    gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//	    gNumbers.forEach((String s) -> System.out.println(s));

        someBingoNumbers
                .stream()
                .map(String :: toUpperCase) // same as 's -> s.toUpperCase()'
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out :: println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");

        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("----------------------------");
        System.out.println(concatStream.distinct().peek(System.out::println).count());

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Boo", 25);
        Employee jack = new Employee("Jack Wand", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");

        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);


        Department accounting = new Department("Accounting");

        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);
    }
}
