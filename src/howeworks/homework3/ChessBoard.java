package howeworks.homework3;

import java.util.Scanner;

public class ChessBoard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(chessBoardCoordinates(x));

    }

    public static String chessBoardCoordinates(String string) {
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char indX = string.charAt(0);
        char indY = string.charAt(1);
        int y = Character.getNumericValue(indY);
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == indX) {
                if (y > 8) {
                    return "Invalid count";
                }
                return (i + 1) + ", " + indY;
            }
        }
        return "Invalid values";
    }
}
