package howeworks.homework2;

public class Exercise16 {

    public static void main(String[] args) {
        rightAngleTriangleNumbers(10);
    }

    public static void rightAngleTriangleNumbers(int num) {
        for(int i = 1; i <= num; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
