package by.epam.basic.branching;

public class Task_1_right_triangle {

    /*  Даны два угла треугольника (в градусах).
     *  определить, существует ли такой треугольник,
     *  и если да, то будет ли он прямоугольным.
     */

    public static void main(String[] args) {

        int firstAngle;
        int secondAngle;

        firstAngle = 40;
        secondAngle = 90;

        checkAngles(firstAngle, secondAngle);

    }

    public static void checkAngles(int firstAngle, int secondAngle) {
        boolean exist;
        boolean rightTriangleExist;

        exist = checkTriangleExist(firstAngle, secondAngle);
        rightTriangleExist = checkRightTriangleExist(firstAngle, secondAngle);

        System.out.println("It is a triangle: " + exist);
        if (exist && rightTriangleExist) {
            System.out.println("It is a right triangle");
        } else if (exist) {
            System.out.println("It is not a right triangle");
        }
    }

    public static boolean checkTriangleExist(int firstAngle, int secondAngle) {
        return 180 > firstAngle + secondAngle;
    }

    public static boolean checkRightTriangleExist(int firstAngle, int secondAngle) {
        return 90 == firstAngle || 90 == secondAngle;
    }
}