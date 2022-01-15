package howeworks.homework3;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 numbers");

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }

        for (int i = 0; i < 10; i+=2) {
            if(array[i] == 0) {
                System.out.println("Error division on zero!");
            } else {
                System.out.println(array[i + 1] / array[i]);
            }

        }

    }
}
