package rbd.project;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My int value " + myIntValue);
        System.out.println("Another int value " + anotherIntValue);

        anotherIntValue++;

        System.out.println("My int value " + myIntValue);
        System.out.println("Another int value " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray after change = " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("myIntArray after modification = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray after modification = " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
