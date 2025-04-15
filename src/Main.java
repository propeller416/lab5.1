/* Создать класс с методами, вычисляющими значения выражения
1) y=3x+5
2) y=(a+b)/(a-b)
3) y=(ax/b)!
Создать три объекта класса */

public class Main {
    public static void main(String[] args) {
        // Создать три объекта класса
        Calc calc1 = new Calc();
        Calc calc2 = new Calc();
        Calc calc3 = new Calc();
        // проверка работы всех 3-х методов
        double y1 = calc1.method1(5.2);
        double y2 = calc1.method2(5.2, 2.1);
        int y3 = calc1.method3(6, 2, 1.3);
        System.out.println("method11 = " + y1);
        System.out.println("method2 = " + y2);
        System.out.println("method3 = " + y3);
    }
}


class Calc {
    public static double method1(double x) {
        double y = 3 * x + 5;
        return y;
    }

    public static double method2(double a, double b) {
        double del = a - b;
        if (del == 0){
            return 0;
        }
        double y = (a + b)/del;
        return y;
    }

    public static int method3(double a, double b, double x) {
        if (b == 0){
            return 0;
        }
        int f = (int)(a * x / b); // вычисление факториала для целочисленного значения
        if (f < 0) {
            return 0;
        }
        int y = 1;
        for (int i = 1; i <= f; i++) {
            y = y * i;
        }
        return y;
    }
}