package howeworks.homework2;

import java.text.DecimalFormat;
import java.util.Objects;

public class Exercise6 {

    public static void main(String[] args) {
        sameFloatPointNumbers(25.589f, 25.589f);
    }

    public static void sameFloatPointNumbers(float a, float b) {
        String formatFloat1 = (new DecimalFormat("#0.000")).format((double) a);
        String formatFloat2 = (new DecimalFormat("#0.000")).format((double) b);
        if (Objects.equals(formatFloat1, formatFloat2)) {
            System.out.println("They are same");
        } else {
            System.out.println("They are different");
        }
    }
}
