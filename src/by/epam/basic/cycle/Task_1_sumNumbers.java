package by.epam.basic.cycle;

import java.util.Scanner;

public class Task_1_sumNumbers {

    /*  Напишите программу, где пользователь вводит любое целое положительное число.
     *  А программа суммирует все числа от 1 до введенного пользователем числа.
     */

    public static void main(String[] args) {

        int a;
        a = enterFromConsole(">>  ");

        sum(a);
    }

    public static void sum(int a) {
        int sum = 0;
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("incorrect value");
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