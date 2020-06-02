package ru.geekbrains.lesson3;

import java.util.Scanner;
import java.lang.*;


public class MainApp {
    public static void main(String[] args) {
        int num = random(9);
        int steps = 3;
        Scanner sc = new Scanner(System.in);
        String[] slova = {"одна попытка","две попытки","три попытки"};
        while (steps > 0) {
            try {
                System.out.println("Система загадала число от 0 до 9. У вас " + slova[steps-1] + " его угадать. " + num);
                System.out.println("Ваше число: ");
                int a = sc.nextInt();
                if (a > num) {
                    System.out.println("Введенное вами число больше загаданного.");
                    steps--;
                    if(steps == 0) {
                        System.out.println("Увы, но все попытки кончились.");
                        System.out.println("Играть еще? 1 - да. 0 - нет");
                        int next = sc.nextInt();
                        if (next == 1) {
                            steps = 3;
                            num = random(9);
                        } else if (next == 0) {
                            break;
                        }
                    }
                } else if (a < num) {
                    System.out.println("Ваше число меньше загаданного.");
                    steps--;
                    if(steps == 0) {
                        System.out.println("Увы, но все попытки кончились.");
                        System.out.println("Играть еще? 1 - да. 0 - нет");
                        int next = sc.nextInt();
                        if (next == 1) {
                            steps = 3;
                            num = random(9);
                        } else if (next == 0) {
                            break;
                        }
                    }
                } else if (a == num){
                    System.out.println("Поздравляю! Вы угадали");
                    System.out.println("Играть еще? 1 - да. 0 - нет");
                    int next = sc.nextInt();
                    if (next == 1) {
                        steps = 3;
                        num = random(9);
                    } else if (next == 0) {
                        break;
                    }
                } else {
                    System.out.println("Введите число.");
                }
            } catch (java.util.InputMismatchException e) {
                sc.next();
                System.out.println("Введены не корректные данные");
            }
        }
        sc.close();
    }
    public static int random(int max) {
        double secretNum = Math.random()*max + 1;
        return (int) secretNum;
    }
}