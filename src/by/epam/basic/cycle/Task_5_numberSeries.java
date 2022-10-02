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
        int n;
        double sum;

        n = 1;
        sum = 0;

        while (Math.abs(calcCommonMemberVal(n)) >= e) {
            sum += calcCommonMemberVal(n);
            System.out.println(n + "value : " + calcCommonMemberVal(n));
            n++;
        }
        System.out.println("Sum is : " + sum);
    }

    public static double calcCommonMemberVal(int degree) {
        return 1 / Math.pow(2, degree) + 1 / Math.pow(3, degree);
    }
}