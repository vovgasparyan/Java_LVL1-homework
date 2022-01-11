package howeworks.homework2;

public class Exercise1 {

    public static void main(String[] args) {
        conditionalActions(25);
    }

    public static void conditionalActions(int num) {
        if (num % 2 != 0) {
            System.out.println("Weird");
        } else if (num >= 2 && num <= 5) {
            System.out.println("Not Weird");
        } else if (num >= 6 && num <= 20) {
            System.out.println("Weird");
        } else if (num > 20) {
            System.out.println("Not Weird");
        }

    }
}
