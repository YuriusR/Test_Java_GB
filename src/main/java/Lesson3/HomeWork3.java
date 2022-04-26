package Lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5(5, 5);
        task6();
        task7();
//        task8(int[] massiv8{1,2,3,4}, -2);


    }




    private static void task1() {

        System.out.println("Задание №1 ");
        int[] massiv1 = {1, 0, 0, 1, 1, 0};
        System.out.print("До замены");
        System.out.println(Arrays.toString(massiv1));
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] == 0) {
                massiv1[i] = 1;
            } else massiv1[i] = 0;

        }
        System.out.print("После замены");
        System.out.println(Arrays.toString(massiv1));
        System.out.println(" ");
    }

    private static void task2() {
        System.out.println("Задание №2 ");
        final int ARREY_SIZE = 100;
        int[] massiv2 = new int[ARREY_SIZE];
        for (int i = 0; i < ARREY_SIZE; i++) {
            massiv2[i] = i + 1;
        }
        System.out.println(Arrays.toString(massiv2));
        System.out.println(" ");
    }

    private static void task3() {
        System.out.println("Задание №3 ");
        int[] massiv3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < massiv3.length; i++) {
            int b = massiv3[i];
            if (massiv3[i] < 6) {
                massiv3[i] = b * 2;

            }
        }
        System.out.println(Arrays.toString(massiv3));
        System.out.println(" ");
    }

    private static void task4() {

        System.out.println("Задание №4 ");
        final int MAS_SIZE = 10;
        int[][] massiv4 = new int[MAS_SIZE][MAS_SIZE];

        for (int i = 0; i < MAS_SIZE; i++) {
            massiv4[i][i] = massiv4[i][(MAS_SIZE - 1) - i] = 5555;
        }

        for (int[] getmassiv4 : massiv4) {
            System.out.println(Arrays.toString(getmassiv4));
        }
        System.out.println(" ");
    }


    //  Начало задачи №5
    private static void task5(int len, int initialValue) {

        System.out.println("Задание №5 ");
        int[] massiv5 = getmassiv5(len, initialValue);
        System.out.println(Arrays.toString(massiv5));
        System.out.println(" ");
    }

    private static int[] getmassiv5(int len, int initialValue) {
        int[] massiv5 = new int[len];
        for (int i = 0; i < massiv5.length; i++) {
            massiv5[i] = initialValue;
        }
        return massiv5;
    }
//  Конец задачи №5

    private static void task6() {

        System.out.println("Задание №6 ");
        int[] massiv6 = {1, 7, 4, 0, 13, 6};

        System.out.println(Arrays.toString(massiv6));
        Arrays.sort(massiv6);
        System.out.println("MAX" + " " + massiv6[massiv6.length - 1]);
        System.out.println("MIN" + " " + massiv6[0]);
        System.out.println(" ");
    }

    private static void task7() {

        System.out.println("Задание №7 ");
    }

    private static void task8(int[] massiv8, int n) {

        System.out.println("Задание №8 ");

    }

}
