package howeworks.homework2;

public class Exercise15 {

    public static void main(String[] args) {
        getSumNaturalNumbers(13);
    }

    public static void getSumNaturalNumbers(int num) {
        int sum = 0;
        int j = 1;
        System.out.print("The odd numbers are: ");

        for(int i = 1; i <= num; ++i) {
            System.out.print(j + " ");
            sum += j;
            j += 2;
        }

        System.out.println();
        System.out.println("The Sum of odd Natural Number up to " + num + " terms is: " + sum);
    }
}
