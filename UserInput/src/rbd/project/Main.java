package rbd.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//            int age = 2022 - yearOfBirth;
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            if (age >= 0 && age <= 100) {
//                System.out.println("Hello " + name + ", you are " + age + " years old");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else {
//            System.out.println("Invalid year of birth");
//        }

        // Challenge

        Scanner scanner = new Scanner(System.in);

        int validNumbersCounter = 0;
        int sum = 0;

        while (validNumbersCounter != 10) {
            int order = validNumbersCounter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int nextInt = scanner.nextInt();
                validNumbersCounter ++;
                sum += nextInt;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        System.out.println("Here are " + validNumbersCounter + " valid numbers and their sum is " + sum);

        scanner.close();
    }
}
