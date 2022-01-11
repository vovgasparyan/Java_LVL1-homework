package howeworks.homework2;

public class Exercise12 {

    public static void main(String[] args) {
        getSumAndAverage(8);
    }

    public static void getSumAndAverage(int num) {
        int sum = 0;
        int average = 0;
        System.out.println("Input the " + num + " numbers:");

        for (int i = 1; i <= num; ++i) {
            System.out.println(i);
            sum += i;
            average = sum / i;
        }

        System.out.println("The sum of " + num + " no is : " + sum);
        System.out.println("The Average is : " + average);
    }
}
