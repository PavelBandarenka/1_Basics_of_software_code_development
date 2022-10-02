package by.epam.basic.linear;

public class Task_4_reverseDigits {

    /*  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
     *  дробную и целую части числа и вывести полученное значение числа.
     */

    public static void main(String[] args) {

        double r;
        double temp;

        r = 888.333;

        temp = Math.floor(r) / 1000 + (r * 1000) % 1000;

        System.out.println("Original value: " + r + ". \nValue after rearranging the numbers: " + temp);
    }
}
