package howeworks.homework3;

import java.util.Objects;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name.");
        String name = scanner.next();

        System.out.println("Enter your age.");
        int userAge = scanner.nextInt();

        System.out.println((isAnsweredNameSamePassportName(name) && isUserAgeSamePassportAge(userAge)) && (isUserAgeGreaterThan18(userAge)) ? "OK" : "NO");
    }

    public static boolean isAnsweredNameSamePassportName(String userName) {
        String passportName = "Vladimir";
        return Objects.equals(userName, passportName);
    }

    public static boolean isUserAgeSamePassportAge(int userAge) {
        int passportAge = 39;
        return userAge == passportAge;
    }

    public static boolean isUserAgeGreaterThan18 (int userAge) {
        return userAge > 18;
    }
}
