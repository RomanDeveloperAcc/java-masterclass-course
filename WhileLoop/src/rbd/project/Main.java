package rbd.project;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//
//        while (count != 5) {
//            System.out.println("Count value = " + count);
//            count++;
//        }
//
//        count = 0;
//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("Count value = " + count);
//            count++;
//        }
//
//        count = 0;
//
//        do {
//            System.out.println("Count value = " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 5);


        int number  = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
