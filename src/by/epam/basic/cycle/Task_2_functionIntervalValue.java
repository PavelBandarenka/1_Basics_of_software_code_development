package by.epam.basic.cycle;

public class Task_2_functionIntervalValue {

    /*  Вычислить значения функции на отрезке [а,b] c шагом h:
     *  y={x,x>2
     *  -x,x<=2
     */

    public static void main(String[] args) {

        int a;
        int b;
        int step;

        a = -3;
        b = 7;
        step = 1;

        countValues(a,b,step);

    }
    public static void countValues (int a, int b, int step){
        for (int i = a; i <= b; i=i+step) {
            if (i <= 2) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}