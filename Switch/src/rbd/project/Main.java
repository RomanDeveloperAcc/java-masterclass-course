package rbd.project;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
        
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Challenge

        char myCharValue = 'A';

        switch (myCharValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
            case 'C': case 'D': case 'E':
                System.out.println("C or D or E was found");
                break;
            default:
                System.out.println("Neither A nor B nor C nor D nor E was not found");
                break;
        }

        String month = "January";

        switch (month.toLowerCase(Locale.ROOT)) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        printDayOfTheWeek(5);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
                break;
        }
    }
}
