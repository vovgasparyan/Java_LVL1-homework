package howeworks.homework2;

public class Exercise2 {

    public static void main(String[] args) {
        numberMultiples(8);
    }

    public static void numberMultiples(int num) {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
