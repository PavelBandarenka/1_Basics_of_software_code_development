package by.epam.basic.cycle;

public class Task_3_sumOfPowers {

    // Найти сумму квадратов первых ста чисел.

    public static void main(String[] args) {

        int sum;
        int count;

        sum = 0;
        count = 100;

        for (int i = 1; i <= count; i++) {
            sum = sum + i * i;
        }

        System.out.println(sum);
    }
}