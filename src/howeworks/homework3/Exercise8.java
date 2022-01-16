package howeworks.homework3;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] shipBoard = new char[6][6];

        for (int i = 0; i < shipBoard.length; i++) {
            for (int j = 0; j < shipBoard[i].length; j++) {
                shipBoard[i][j] = '*';
                System.out.print(shipBoard[i][j] + " ");
            }
            System.out.println();
        }

        int[][] ships = new int[6][6];
        ships[0][1] = 1;
        ships[0][2] = 1;
        ships[0][3] = 1;
        ships[0][4] = 1;
        ships[0][5] = 1;
        ships[1][0] = 1;
        ships[2][0] = 1;
        ships[3][0] = 1;
        ships[2][3] = 1;
        ships[2][5] = 1;
        ships[3][5] = 1;
        ships[4][5] = 1;
        ships[3][2] = 1;
        ships[5][0] = 1;
        ships[5][1] = 1;
        ships[5][2] = 1;
        ships[5][3] = 1;
        ships[5][4] = 1;




        for (int i = 0; i < ships.length; i++) {
            for (int j = 0; j < ships[i].length; j++) {
                System.out.print(ships[i][j] + " ");
            }
            System.out.println();
        }




        //String inputValue = scanner.next();

        //System.out.println(inputValue);
    }
}
