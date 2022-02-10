package by.epam.basic.branching;

public class Task_5_functionValue {

    /*  Вычислить значение функции:
     *  F(x) = { x^2 -3*x +9, если x<=3;
     *           1/(x^3 +6),  если x>3;
     */

    public static void main(String[] args) {

        double x;

        x = 4;

        calculateValue(x);
    }

    public static void calculateValue(double x) {
        double value;
        if (x <= 3) {
            value = calculateFirstOption(x);
        } else {
            value = calculateSecondOption(x);
        }
        System.out.println(" x = " + x + "Function value = " + value);
    }

    public static double calculateFirstOption(double x) {
        double value;
        value = x * x - 3 * x + 9;
        return value;
    }

    public static double calculateSecondOption(double x) {
        double value;
        value = 1 / (x * x * x + 6);
        return value;
    }
}