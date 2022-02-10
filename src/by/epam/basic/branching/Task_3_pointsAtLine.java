package by.epam.basic.branching;

public class Task_3_pointsAtLine {

    /*  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
     *  Определить, будут ли они расположены на одной прямой.
     */

    public static void main(String[] args) {

        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;

        x1 = 9;
        y1 = 9;
        x2 = 7;
        y2 = 7;
        x3 = 5;
        y3 = 5;

        checkIfCollinear(x1, y1, x2, y2, x3, y3);

    }

    public static boolean onTheSameLine(double triangleArea) {
        return triangleArea == 0;
    }

    public static double checkTriangleExist(double x1, double y1, double x2, double y2, double x3, double y3) {
        double triangleArea;
        triangleArea = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;
        return triangleArea;
    }

    public static void checkIfCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
        double triangleArea;
        boolean sameLine;

        triangleArea = checkTriangleExist(x1, y1, x2, y2, x3, y3);
        sameLine = onTheSameLine(triangleArea);

        if (sameLine) {
            System.out.println("A,B and C are collinear  ");
        } else {
            System.out.println("A,B and C are NOT collinear  ");
        }
    }
}