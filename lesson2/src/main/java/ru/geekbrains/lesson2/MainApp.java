package ru.geekbrains.lesson2;

public class MainApp {
    public static void main(String[] args) {
        //Первое задание
        int[] arr = {1,1,1,0,0,1,0,0,0,1,0,1,1};
        for(int i = 0; i < arr.length; i++) {
            System.out.println("old " + arr[i]);
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.println("new " + arr[i]);
        }
        //Второе задание
        int[] arr2 = new int[8];
        for(int i = 0, j = 0; i < arr2.length; i++) {
            arr2[i] = j;
            j = j + 3;
            System.out.print(arr2[i] + " ");
        }
        //Третье задание
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        for(int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6) {
                arr3[i] = arr3[i]*6;
            }
            System.out.print(arr3[i] + " ");
        }
        //Четвертое задание
        System.out.println();
        fillArr();
        int[] arr4 = {0,1,1,1,1,1,5,1};
        minMax(arr4);
        System.out.println(arrayCompare(arr4));
    }
    public static void fillArr() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            table[0][0] = 1;
            table[i][i] = 1;
            int a = (table.length - 1) - i;
            table[i][a] = 1;
        }
        printArr(table);
    }
    //Задание 5
    public static void minMax(int[] arr) {
        int min = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальный: " + min + ", максимальный: " + max);
    }

    //задание 6
    public static boolean arrayCompare(int[] arr) {
        int left = 0;
        int right = 0;
        for(int i = 0; i < arr.length-1;) {
            left = left + arr[i];
            i++;
            right = arraySumm(arr, i);
            if(left == right) {
                return true;
            }
        } return false;
    }

    public static int arraySumm(int[] arr, int step) {
        int summ = 0;
        for(int i = step; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        System.out.println(summ);
        return summ;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

