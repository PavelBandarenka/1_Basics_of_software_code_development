package by.epam.basic.linear;

public class Task_5_timeFormat {

    /*  Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
     *  данное значение длительности в часах, минутах и секундах в следующей форме:
     *  ННч ММмин SSc.
     */

    public static void main(String[] args) {

        int timeInSeconds;
        int hour;
        int minute;

        timeInSeconds = 9567;

        hour = timeInSeconds / 3600;
        minute = (timeInSeconds - hour * 3600) / 60;
        timeInSeconds = (timeInSeconds - hour * 3600 - minute * 60);

        System.out.println(hour + "h " + minute + "min " + timeInSeconds + "sec");
    }
}