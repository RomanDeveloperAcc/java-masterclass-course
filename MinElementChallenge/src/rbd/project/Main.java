package rbd.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] myIntegers = readIntegers(5);
        System.out.println("Minimum value in array is " + findMin(myIntegers));
    }

    public static int[] readIntegers(int number) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + number + " integer values.\r");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int findMin(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
