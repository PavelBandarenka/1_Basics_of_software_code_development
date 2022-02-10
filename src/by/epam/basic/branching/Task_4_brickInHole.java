package by.epam.basic.branching;

public class Task_4_brickInHole {

    /*  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
     *  Определить, пройдет ли кирпич через отверстие.
     */

    public static void main(String[] args) {

        int a;
        int b;
        int x;
        int y;
        int z;

        a = 3;
        b = 7;
        x = 2;
        y = 6;
        z = 7;

        checkIfSuitable(a, b, x, y, z);
    }

    public static void checkIfSuitable(int a, int b, int x, int y, int z) {
        boolean suitableSize;
        suitableSize = sidesFit(a, b, x, y, z);
        if (suitableSize) {
            System.out.println("Brick went through the hole ");
        } else {
            System.out.println("brick cannot go through the hole ");
        }
    }

    public static boolean sidesFit(int a, int b, int x, int y, int z) {
        boolean xyAB;
        boolean xzAB;
        boolean yzAB;
        xyAB = (x < a && y < b || y < a && x < b);
        xzAB = (x < a && z < b || z < a && x < b);
        yzAB = (y < a && z < b || z < a && y < b);
        return xyAB || xzAB || yzAB;
    }
}