package howeworks.homework3;

import java.util.Scanner;

public class ChessHorseStep {

    public static void main(String[] args) {

        System.out.println("Enter horse step in this format \"a1-b3\"");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();


        if(x.length() < 5 || x.length() > 6) {
            System.out.println("You are input horse step in not valid format");
        } else {
            String firstStep = x.charAt(0) + "" + x.charAt(1);
            String stopStep = x.charAt(3) + "" + x.charAt(4);

            if(isPossibleStep(firstStep, stopStep)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean isPossibleStep(String startStep, String endStep) {
        int letters = Math.abs(startStep.toUpperCase().charAt(0) - endStep.toUpperCase().charAt(0));
        int numbers = Math.abs(startStep.charAt(1) - endStep.charAt(1));
        if (letters == 2) {
            return numbers == 1;
        } else if (numbers == 2) {
            return letters == 1;
        } else {
            return false;
        }
    }

}
