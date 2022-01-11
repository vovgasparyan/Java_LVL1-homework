package howeworks.homework1;

public class Exercise1 {

    public static void main(String[] args) {
        int i1 = 564;
        int i2 = 654;
        int i3 = 6584;
        int i4 = 6584;
        int i5 = 6888554;
        int intValue12 = min(i1, i2);
        int intValue123 = min(intValue12, i3);
        int intValue1234 = min(intValue123, i4);
        int intValue12345 = min(intValue1234, i5);
        System.out.println(intValue12);
        System.out.println(intValue123);
        System.out.println(intValue1234);
        System.out.println(intValue12345);
    }

    public static int min(int intVal1, int intVal2) {
        return Math.min(intVal1, intVal2);
    }

}
