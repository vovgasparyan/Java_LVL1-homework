package howeworks.homework3;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fb1 = 1;
        int fb2 = 1;
        int sum;

        for (int i = 0; i < n - 2 ; i++) {
            sum = fb1 + fb2;
            fb1 = fb2;
            fb2 = sum;
        }

        System.out.println(fb2);
    }


}
