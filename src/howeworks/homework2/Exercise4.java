package howeworks.homework2;

public class Exercise4 {

    public static void main(String[] args) {
        checkFloatNumber(15f);
    }

    public static void checkFloatNumber(float num) {
        if (num == 0.0f) {
            System.out.println("Input number is 0");
        } else if (num > 0.0f) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

    }
}
