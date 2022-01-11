package howeworks.homework2;

public class Exercise13 {

    public static void main(String[] args) {
        calculateCube(7);
    }

    public static void calculateCube(int num) {
        for (int i = 1; i <= num; ++i) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + i * i * i);
        }
    }
}
