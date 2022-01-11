package howeworks.homework2;

public class Exercise11 {

    public static void main(String[] args) {
        naturalNum(5);
    }

    public static void naturalNum(int num) {
        int sum = 0;
        System.out.println("Input number:\n" + num);
        System.out.print("The first " + num + " natural numbers are : " + num + " ");

        for (int i = 1; i <= num; ++i) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The Sum of Natural Number up to " + num + " terms : " + num + sum);
    }
}
