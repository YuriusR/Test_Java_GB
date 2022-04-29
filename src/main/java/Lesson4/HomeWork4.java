package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    final static int SIZE = 3;
    final static int DOTS_TO_WIN = 3;

    final static char DOT_EMPTY = '•';
    final static char DOT_X = 'X';
    final static char DOT_O = 'O';
    static final String FIRST_SYMBOL = "☻";
    static final String SPACE_MAP = " ";
    static final Scanner in = new Scanner(System.in);
    static Random random = new Random();

    final static char[][] MAP = new char[SIZE][SIZE];

    public static void main(String[] args) {

        turnGame();


    }

    private static void turnGame() {

        initialMap();
        printMap();
        playGame();
    }

    private static void initialMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;

            }

        }
    }


    private static void printMap() {

        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + SPACE_MAP);
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + SPACE_MAP);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println(" ");
        }
    }


    private static void playGame() {
        while (true) {
//        ход игрока
            humanTurn();
//        печать игр.поля
//            printMap();
//        проверка
            if (checkEnd(DOT_X)) {
                break;
            }

//        ход ПК
            aiTurn();
//        печать игр.поля
            printMap();

//        проверка
            if (checkEnd(DOT_O)) {
                break;
            }
        }

//        возврат в начало


    }
    private static void humanTurn() {
        System.out.println("Твой ход");
        int rowNumber;
        int columnNumber;

        while (true) {
            rowNumber = in.nextInt() - 1;
            columnNumber = in.nextInt() - 1;

            if (inCellFree(columnNumber, rowNumber)) {
                break;
            }
            System.out.println("Ячейка занята");
        }
        MAP[columnNumber][rowNumber] = DOT_X;
    }

    private static boolean inCellFree(int rowNmber, int columnNumber) {
        return MAP[rowNmber][columnNumber] == DOT_EMPTY;
    }
    private static void aiTurn() {
        int rowNumber;
        int columnNumber;


        do {

            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);


        } while (!inCellFree(columnNumber, rowNumber));
        MAP[columnNumber][rowNumber] = DOT_O;
    }

    private static boolean checkEnd(char symbol) {


        return false;
    }

}
