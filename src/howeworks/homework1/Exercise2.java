package howeworks.homework1;

import java.io.PrintStream;

public class Exercise2 {

    public static void main(String[] args) {
        int valueMaxMin1 = 64;
        int valueMaxMin2 = 32;
        int valueMaxMin3 = 21;
        PrintStream var10000 = System.out;
        int var10001 = max(valueMaxMin1, valueMaxMin2, valueMaxMin3);
        var10000.println("Method max:\n" + var10001);
        var10000 = System.out;
        var10001 = min(valueMaxMin1, valueMaxMin2, valueMaxMin3);
        var10000.println("Method min:\n" + var10001);
        System.out.println("Sum of " + valueMaxMin1 + " and " + valueMaxMin2 + " is: " + mathPrimitiveOperations(valueMaxMin1, valueMaxMin2, 1));
        System.out.println("Difference of " + valueMaxMin1 + " and " + valueMaxMin2 + " is: " + mathPrimitiveOperations(valueMaxMin1, valueMaxMin2, 2));
        System.out.println("multiplication of " + valueMaxMin1 + " and " + valueMaxMin2 + " is: " + mathPrimitiveOperations(valueMaxMin1, valueMaxMin2, 3));
        System.out.println("Division of " + valueMaxMin1 + " and " + valueMaxMin2 + " is: " + mathPrimitiveOperations(valueMaxMin1, valueMaxMin2, 4));
        System.out.println(mathPrimitiveOperations(valueMaxMin1, valueMaxMin2, 6));
    }

    public static int max(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int min(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static int mathPrimitiveOperations(int num1, int num2, int numOfOperation) {
        int result = 0;
        switch(numOfOperation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.print("Error division on zero. Result of your method is ");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.print("Select operation number from 1 to 4. Result of your method is ");
        }

        return result;
    }
}
