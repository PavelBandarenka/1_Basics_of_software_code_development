package by.epam.basic.cycle;

import java.util.Scanner;

public class Task_7_numberDivisor {

    /*
     *  Для каждого натурального числа в промежутке от m до n вывести все делители,
     *  кроме единицы и самого числа.
     *  m и n вводятся с клавиатуры.
     */

    public static void main(String[] args) {

        int m = enterFromConsole("m -> ");
        int n = enterFromConsole("n -> ");

        findDivisor(m, n);

    }

    public static void findDivisor(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.println();
            System.out.print("Digit: " + i + " divisors: ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print( j + " ");
                }
            }
        }
    }

    public static int enterFromConsole(String st) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print(st);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(st);
        }
        number = sc.nextInt();
        return number;
    }
}