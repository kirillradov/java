package ru.geekbrains.lesson4;

import java.util.Scanner;
import java.util.Random;

public class MainApp {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X =  'X';
    public static final char DOT_O = 'O';

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean checkWin(char symb) {
/*        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;*/
        int cuclesX  = map.length;
        int cuclesY = map.length;
        int lineupX = 0;
        int lineupY = 0;
        int lineupD1 = 0;
        int lineupD2 = 0;
        for(int i = 2; i > 0; i--) {
            for(int j = 0; j < map.length; j++) {
                if(map[j][j] == symb) {
                    lineupD1++;
                } else lineupD1 = 0;
                if(map[(map.length - j) - 1][j] == symb) {
                    lineupD2++;
                } else lineupD2 = 0;
            }
            if(lineupD1 == (map.length-1) || lineupD2 == (map.length-1)) {
                return true;
            }
        }
        while(cuclesX > 0) {
            for(int i = 0; i < map.length; i++) {
                for(int j = 0; j < map.length; j++) {
                    if(map[i][j] == symb) {
                        lineupX++;
                    } else lineupX = 0;
                }
                if(lineupX == (map.length-1)) {
                    return true;
                }
                cuclesX--;
            }
        }
        while(cuclesY > 0) {
            for(int i = 0; i < map.length; i++) {
                for(int j = 0; j < map.length; j++) {
                    if(map[j][i] == symb) {
                        lineupY++;
                    } else lineupY = 0;
                }
                if(lineupY == (map.length -1)) {
                    return true;
                }
                cuclesY--;
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

/*        String[][] pole = {
                {" · "," · "," · "},
                {" · "," · "," · "},
                {" · "," · "," · "},
        };

        int winner = 0;
        int steps = 9;
        int[] comp = {0,0};
        Scanner scanner = new Scanner(System.in);
        printArr(pole);

        while(steps > 0) {

            winner = isWinner(pole);
            if(winner == 1) {
                System.out.println("Победа за игроком!");
                break;
            } else if (winner == 2) {
                System.out.println("Победил компьютер.");
                break;
            }
            System.out.println("Выберите столбец: (слева направо 1-3)");
            int x = scanner.nextInt();
            System.out.println("Выберите строку: (сверху вниз 1-3)");
            int y = scanner.nextInt();
            while (pole[y-1][x-1].equals(" 0 ") || pole[y-1][x-1].equals(" X ")) {
                System.out.println("Выберите другую позицию.");
                printArr(pole);
                System.out.println("Выберите столбец: (слева направо 1-3)");
                x = scanner.nextInt();
                System.out.println("Выберите строку: (сверху вниз 1-3)");
                y = scanner.nextInt();
            }
            pole[y-1][x-1] = " X ";
            steps--;
            printArr(pole);
            System.out.println("Ход компьютера");
            comp = computer(pole);
            pole[comp[0]][comp[1]] = " 0 ";
            printArr(pole);
        }
        System.out.println(winner == 0 ? "Ничья." : "Игра окончена");
    }

    public static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int isWinner(String[][] pole) {
        int winner = 0;
        if(pole[0][0].equals(" X ") && pole[0][1].equals(" X ") && pole[0][2].equals(" X ")) {
            winner = 1;
        } else if (pole[0][0].equals(" 0 ") && pole[0][1].equals(" 0 ") && pole[0][2].equals(" 0 ")){
            winner = 2;
        }
        return winner;
    }

    public static int[] computer(String[][] pole) {
        int x = random(2);
        int y = random(2);
        while(pole[x][y].equals(" X ") || pole[x][y].equals(" 0 ")) {
            x = random(2);
            y = random(2);
            break;
        }
        int[] a = {x,y};
        return a;
    }

    public static int random(int max) {
        double num = Math.random() * max + 1;
        return (int) num;
    }
*/
}
