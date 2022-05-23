package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static String name = Main.getName();

    public static int size = Main.getSize();
    static int dotsTOwin = 3;
    static int rowNumber = 0;
    static int columnNumber = 0;
    static char lastTurn = ' ';
    final static char DOT_EMPTY = '•';
    final static char DOT_HUMAN = 'X';
    final static char DOT_AI = 'O';
    static final String FIRST_SYMBOL = "/";
    static final String SPACE_MAP = " ";
    static final Scanner in = new Scanner(System.in);

    static Random random = new Random();

    final static char[][] MAP = new char[size][size];

    public static void turnGame() {


        initialMap();
        printMap();
        playGame();
    }


    private static void initialMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
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
        for (int i = 0; i < size; i++) {
            System.out.printf("%s", (i + 1) + SPACE_MAP);
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%s", (i + 1) + SPACE_MAP);
            for (int j = 0; j < size; j++) {
                System.out.printf("%s", MAP[i][j] + SPACE_MAP);
            }
            System.out.println(" ");
        }
    }


    private static void playGame() {
        while (true) {

            humanTurn();

            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();

            if (checkEnd(DOT_AI)) {
                break;
            }

            printMap();
        }
    }

    private static void humanTurn() {

        System.out.println("Твой ход," + " " + name);
        /*int rowNumber;
        int columnNumber;*/

        while (true) {
            System.out.println("Введите № столбца:");
            rowNumber = in.nextInt() - 1;
            System.out.println("Введите № строки:");
            columnNumber = in.nextInt() - 1;

            if (inCellFree(columnNumber, rowNumber)) {
                break;
            }
            System.out.println("Ячейка занята");
        }
        MAP[columnNumber][rowNumber] = DOT_HUMAN;
        lastTurn = DOT_HUMAN;

    }

    private static boolean inCellFree(int rowNmber, int columnNumber) {
        return MAP[rowNmber][columnNumber] == DOT_EMPTY;
    }

    private static void aiTurn() {
        System.out.println("Ход Искусственного разума");
        /*int rowNumber;
        int columnNumber;*/

        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);
        } while (!inCellFree(columnNumber, rowNumber));
        MAP[columnNumber][rowNumber] = DOT_AI;
        lastTurn = DOT_AI;
    }

    private static boolean checkEnd(char symbol) {

        if (checkWin(symbol)) {
            printMap();
            if (symbol == DOT_HUMAN) {
                System.out.println("Ты Победил," + " " + name + "," + " " + "кожаный Мешок!");
                return true;
            } else {
                System.out.println("ХАХАХА! Я победил! Мой Разум сильнее...");
            }
            return true;

        }
        if (checkDraw()) {
            System.out.println("Ничья! Сыграем ещё разок?");
            return true;
        }
        return false;

    }

    private static boolean checkWin(char symbol) {
        if (checkWinColumn() || checkWinRow() || checkWinD1() || checkWinD2()) {
            return true;
        } else return false;
    }

    private static boolean checkWinD2() {
        int chekD2 = 0;
        for (int i = 0; i < size; i++) {

            if (MAP[i][size - 1] == lastTurn) {
                chekD2++;
            } else chekD2 = 0;
        }
        if (chekD2 == dotsTOwin) {
            return true;
        }
        return false;
    }

    private static boolean checkWinD1() {
        int chekD1 = 0;
        for (int i = 0; i < size; i++) {

            if (MAP[i][i] == lastTurn) {
                chekD1++;
            } else chekD1 = 0;
        }
        if (chekD1 == dotsTOwin) {
            return true;
        }
        return false;
    }

    private static boolean checkWinRow() {
        int checkRow = 0;
        for (char[] chars : MAP) {
            for (int rowNumber : chars) {
                if (rowNumber == lastTurn) {
                    checkRow++;
                } else checkRow = 0;
            }
            if (checkRow == dotsTOwin) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWinColumn() {  //РАЗОБРАТЬСЯ С КОЛОНКОЙ

        int checkColumn = 0;
  /*      for (int i = 0; i < size; )  {
            for (int j = 0; j < rowNumber; j++) {
                if (MAP[i][j] == lastTurn) {
                    checkColumn++;
            }else checkColumn = 0;

            }if (checkColumn == dotsTOwin) {
                return true;
            }

        }*/

        return false;
    }

    private static boolean checkDraw() {
        for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
