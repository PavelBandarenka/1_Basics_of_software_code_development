package by.epam.basic.linear;

public class Task_2_functionValue {

    /*  Вычислить значение выражения по формуле
     *  все переменные принимают действительные значения)
     *  (b + √ (b^2 + 4*a*c)) / 2*a  - a^3 *c + b^-2
     */

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double value;

        a = 2.3;
        b = 4.5;
        c = 6.7;

        value = Math.sqrt(b * b + 4 * a * c) / (2 * a) - a * a * a * c + Math.pow(b, -2);

        System.out.println("Expression value =  " + value);
    }
}
