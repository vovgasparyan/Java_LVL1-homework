package howeworks.homework2;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Input number from 1 to 7");
        int number = inputValue.nextInt();
        getWeekDay(number);
    }

    public static void getWeekDay(int number) {
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Input number between 1 and 7");
        }
    }
}
