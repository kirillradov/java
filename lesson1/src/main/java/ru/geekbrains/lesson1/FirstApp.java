package ru.geekbrains.lesson1;

public class FirstApp {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
//  Второе задание
            byte a = 120;
            short b = 20000;
            int c = 345839;
            long d = 9223372036854775807L;
            float e = 7.67f;
            double f = 3.45653445;
            char g = '\u2242';
            boolean h = true;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            System.out.println(summ(10,2,2,2));
            System.out.println(from10To20(8,3));
            isPositiveOrNegative(-45);
            System.out.println(isNegativeNumber(-6));
            hiName("Иван");
            isLeapYear(2024);
        }
    //Третье задание
    public static int summ(int a1, int b1, int c1, int d1) {
        return a1*(b1 +(c1 / d1));
    }
    //Четвертое задание
    public static boolean from10To20(int a2, int b2) {
        if ((a2 + b2) >= 10 && (a2 + b2) <= 20) {
            return true;
        } else return false;
    }
    //Пятое задание
    public static void isPositiveOrNegative(int a) {
            System.out.println((a >= 0) ? "положительное" : "отрицательное");
    }
    //Шестое задание
    public static boolean isNegativeNumber(int a) {
            if (a < 0) {
                return true;
            } else return false;
    }
    //Седьмое задание
    public static void hiName(String firstName) {
            System.out.println("Привет, " + firstName + "!");
    }
    //Восьмое задание
    public static void isLeapYear(int a) {
            if( (a%4 == 0 && a%100 != 0) || a%400 == 0) {
                System.out.println("Год " + a + " високосный");
            } else System.out.println("Год " + a + " не високосный");
    }

}

