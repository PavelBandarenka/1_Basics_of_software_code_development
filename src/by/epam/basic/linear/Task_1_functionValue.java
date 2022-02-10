package by.epam.basic.linear;

public class Task_1_functionValue {

    //  Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double z;

        a = 2;
        b = 4;
        c = 6;

        z = a - 3;
        z = z * b;
        z = z / 2;
        z = z + c;

        System.out.println("Z function value =  " + z);
    }
}

