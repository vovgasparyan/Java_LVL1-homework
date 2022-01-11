package howeworks.homework2;

public class Exercise14 {

    public static void main(String[] args) {
        multiplicationTable(7);
    }

    public static void multiplicationTable(int num) {
        for(int i = 0; i <= num; ++i) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
