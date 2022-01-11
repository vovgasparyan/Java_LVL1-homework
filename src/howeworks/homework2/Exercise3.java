package howeworks.homework2;

public class Exercise3 {

    public static void main(String[] args) {
        quadraticEquations(-4.0D, 5.0D, 2.0D);
    }

    public static void quadraticEquations(double a, double b, double c) {
        if (a == 0.0D) {
            System.out.println("Value \"a\" can not be 0");
        } else {
            double d = b * b - 4.0D * a * c;
            if (d < 0.0D) {
                System.out.println("This quadratic equation have not roots");
            } else {
                double x;
                if (d == 0.0D) {
                    x = -b / (2.0D * a);
                    System.out.println("This quadratic equation have one root:\nx = " + x);
                } else {
                    x = (-b + Math.sqrt(d)) / 2.0D * a;
                    double x2 = (-b - Math.sqrt(d)) / 2.0D * a;
                    System.out.println("Roots of quadratic equation is:\nx1 = " + x + " x2 = " + x2);
                }
            }
        }

    }
}
