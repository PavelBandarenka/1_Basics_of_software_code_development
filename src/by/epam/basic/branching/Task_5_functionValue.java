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
            value = calculateFirstExpression(x);
        } else {
            value = calculateSecondExpression(x);
        }
        System.out.println("For x = " + x + ", function value is = " + value);
    }

    public static double calculateFirstExpression(double x) {
        return x * x - 3 * x + 9;
    }

    public static double calculateSecondExpression(double x) {
        return 1 / (x * x * x + 6);
    }
}