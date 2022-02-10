package by.epam.basic.linear;

public class Task_6_pointCoordinates {

    /*  Для данной области составить линейную программу, которая печатает true,
     *  если точка с координатами (х, у) принадлежит закрашенной области,
     *  и false — в противном случае.
     */

    public static void main(String[] args) {

        int x;
        int y;
        boolean inArea;

        x = -1;
        y = 2;

        inArea = checkCoordinates(x, y);
        System.out.println("(" + x + ", " + y + ") " + inArea);
    }

    public static boolean checkCoordinates(int x, int y) {
        if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            return true;
        } else {
            return x >= -4 && x <= 4 && y >= -3 && y <= 0;
        }
    }
}