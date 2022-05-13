package Lesson4;

import java.util.Scanner;

public class Main {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork4.turnGame();
        getName();
        getSize();

    }

    public static String getName() {
        System.out.println("Как тебя зовут, Человек?");
        String name = in.nextLine();
        return name;
    }

    public static int getSize() {
//        System.out.println("Напиши размер поля от 3 до 9");
        int d = getSizeFromScanner("Введите число в пределах от 3 до 9", 3,
                9);
        return d;
    }

    public static int getSizeFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = in.nextInt();
        } while (x < min || x > max);
        return x;
    }

}
