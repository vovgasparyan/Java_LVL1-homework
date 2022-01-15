package howeworks.homework3;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println("Input 20 numbers.");
        readNumber();
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 20 ; i++) {
            int inputNumber = scanner.nextInt();
            if ((inputNumber < 0) || (inputNumber > 100)) {
                System.out.println("Your input number is out of range");
            } else {
                sum += inputNumber;
            }
        }
        System.out.println("Sum of input numbers is: " + sum);
    }

    public static void readNumber() {
        checkNumber();
    }


}
