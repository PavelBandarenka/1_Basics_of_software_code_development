package by.epam.basic.linear;

public class Task_3_functionValue {

    /*  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     *  ((𝑠𝑖𝑛𝑥  + 𝑐𝑜𝑠 y) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 y ))  ∗ 𝑡𝑔 𝑥y
     */

    public static void main(String[] args) {

        double x;
        double y;
        double value;

        x = 4.4;
        y = 5.5;

        value = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println("Expression value =  " + value);
    }
}

