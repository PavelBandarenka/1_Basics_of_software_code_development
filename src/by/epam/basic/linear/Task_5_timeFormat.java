package by.epam.basic.linear;

public class Task_5_timeFormat {

    /*  Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
     *  данное значение длительности в часах, минутах и секундах в следующей форме:
     *  ННч ММмин SSc.
     */

    public static void main(String[] args) {

        int timeInSeconds = 9567;

        countTime(timeInSeconds);

    }

    public static void countTime(int seconds) {
        int hour;
        int minute;

        hour = seconds / 3600;
        minute = (seconds - hour * 3600) / 60;
        seconds = (seconds - hour * 3600 - minute * 60);

        System.out.println(hour + "ч " + minute + "мин " + seconds + "с");
    }
}