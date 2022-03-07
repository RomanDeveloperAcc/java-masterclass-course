package rbd.project;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10 000 at 2% interest = " + calculateInterest(10000.0, 2.0));

//        for (int i = 2; i < 9; i++) {
//            System.out.println("10 000 at " + i +" % interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }
//
//        for (int i = 8; i > 1; i--) {
//            System.out.println("10 000 at " + i +" % interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }

//        int counter = 0;
//
//        for (int i = 2; i <= 10; i ++) {
//            if (counter == 3) {
//                break;
//            }
//
//            if (isPrime(i)) {
//                System.out.println(i);
//                counter++;
//            }
//        }

        // Challenge
        int challengeCounter = 0;
        int sum = 0;

        for (int i = 1; i < 1001; i ++) {
            if (challengeCounter == 5) {
                break;
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
                challengeCounter++;
            }
        }

        System.out.println(sum);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
