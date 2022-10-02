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

        checkTriangleAngles(firstAngle, secondAngle);

    }

    public static void checkTriangleAngles(int firstAngle, int secondAngle) {
        boolean isTriangle;
        boolean isRightTriangle;

        isTriangle = isTriangleExist(firstAngle, secondAngle);
        isRightTriangle = isRightTriangleExist(firstAngle, secondAngle);

        System.out.println("It is a triangle: " + isTriangle);
        if (isTriangle && isRightTriangle) {
            System.out.println("It is a right triangle");
        } else if (isTriangle) {
            System.out.println("It is not a right triangle");
        }
    }

    public static boolean isTriangleExist(int firstAngle, int secondAngle) {
        return 180 > firstAngle + secondAngle;
    }

    public static boolean isRightTriangleExist(int firstAngle, int secondAngle) {
        return 90 == firstAngle || 90 == secondAngle;
    }
}