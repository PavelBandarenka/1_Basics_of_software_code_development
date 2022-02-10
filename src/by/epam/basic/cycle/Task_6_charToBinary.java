package by.epam.basic.cycle;

public class Task_6_charToBinary {

    /*
       Вывести на экран соответствий
       между символами и их численными
       обозначениями в памяти компьютера.
    */

    public static void main(String[] args) {

        char ch;

        ch = 'b';

        findBinaryConformity(ch);

    }

    public static void findBinaryConformity(char ch) {
        String a;

        a = Integer.toBinaryString(ch);
        System.out.println(a);
    }
}
