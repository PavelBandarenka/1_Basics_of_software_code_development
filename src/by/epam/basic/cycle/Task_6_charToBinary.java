package by.epam.basic.cycle;

public class Task_6_charToBinary {

    /*
       Вывести на экран соответствий
       между символами и их численными
       обозначениями в памяти компьютера.
    */

    public static void main(String[] args) {

        int startingPoint;
        int endPoint;

        startingPoint = 65;
        endPoint = 90;

        for (int i = startingPoint; i <= endPoint; i++) {

            System.out.println((char)i + " --> " + i);
        }
    }
}
