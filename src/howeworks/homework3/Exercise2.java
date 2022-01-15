package howeworks.homework3;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers 6 times");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int number6 = scanner.nextInt();

        if ((number1 == 10) || (number2 == 10) || (number3 == 10) || (number4 == 10) ||
                (number5 == 10) || (number6 == 10)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


}
