package by.epam.basic.linear;

public class Task_6_pointCoordinates {

    /*  Для данной области составить линейную программу, которая печатает true,
     *  если точка с координатами (х, у) принадлежит закрашенной области,
     *  и false — в противном случае.
     */

    //Field borders coordinates
    static int x1Min, x1Max, y1Min, y1Max;
    static int x2Min, x2Max, y2Min, y2Max;

    public static void main(String[] args) {

        int x;
        int y;
        boolean inArea;

        x = -1;
        y = 2;

        x1Min = -2;
        x1Max = 2;
        y1Min = 0;
        y1Max = 4;

        x2Min = -4;
        x2Max = 4;
        y2Min = -3;
        y2Max = 0;

        inArea = isInArea(x, y);

        System.out.println("(" + x + ", " + y + ") is in area: " + inArea);
    }
    private static boolean isInArea(int x, int y) {
        return (x >= x1Min && x <= x1Max && y >= y1Min && y <= y1Max) ||
                (x >= x2Min && x <= x2Max && y >= y2Min && y <= y2Max);
    }
}
