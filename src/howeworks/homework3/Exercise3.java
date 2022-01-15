package howeworks.homework3;

public class Exercise3 {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("The sum of array elements is: " + sum);
    }
}
