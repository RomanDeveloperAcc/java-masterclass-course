package rbd.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean isFirstNumber = true;

        while (true) {
            System.out.println("Enter number:");
            boolean isNextInt = scanner.hasNextInt();

            if (isNextInt) {
                int number = scanner.nextInt();

                if (isFirstNumber) {
                    max = number;
                    min = number;
                    isFirstNumber = false;
                } else {
                    if (min > number) {
                        min = number;
                    }

                    if (max < number) {
                        max = number;
                    }
                }
            } else {
                System.out.println("Min value is " + min + " and max value is " + max);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
