package howeworks.homework2;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Input year");
        int year = inputYear.nextInt();
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        if (year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) {
            System.out.println(year + " is a not leap year");
        } else {
            System.out.println(year + " is a leap year");
        }
    }
}
