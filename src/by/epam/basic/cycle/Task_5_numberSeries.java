package by.epam.basic.cycle;

public class Task_5_numberSeries {

    /*
     *  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
     *  заданному е. Общий член ряда имеет вид:  An = 1/2n + 1/3n
     */

    public static void main(String[] args) {

        double e;

        e = 0.001;

        calcSum(e);

    }

    public static void calcSum(double e) {
        double a;
        int n;
        double sum;

        a = 1.0 / 6.0;
        n = 1;
        sum = a;

        while (Math.abs(a) >= e) {
            a = calcCommonMemberVal(n);
            sum += a;
            n++;
        }
        System.out.println(sum);
    }

    public static double calcCommonMemberVal(int degree) {
        double commonMemberValue;
        commonMemberValue = 1 / Math.pow(2, degree) + 1 / Math.pow(3, degree);
        return commonMemberValue;
    }
}
