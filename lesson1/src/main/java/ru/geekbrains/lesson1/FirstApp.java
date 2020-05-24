package ru.geekbrains.lesson1;

public class FirstApp {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
//  Первое задание
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
        }
        //  Второе задание
        public static int summ(int a1, int b1, int c1, int d1) {
        return a1*(b1 +(c1 / d1));
    }
}

