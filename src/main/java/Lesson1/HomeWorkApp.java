package Lesson1;

public class HomeWorkApp {

    /* Далее задача №1 */
    public static void main(String[] args) {
        System.out.println( "*** This my first homework :-) ***" );
        System.out.println();

        printThreeWords();
        checkSumSign();
        printColor();
        Numbers();
    }

    /* Далее задача №2 */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }
    /* Далее задача №3. */
    public static void checkSumSign() {
        int a = -7, b = 14;
        int y = a + b;
        if (y >= 0) System.out.println("The sum is positive");
        else System.out.println("The sum is negative");
        System.out.println();
        /* Почему-то моя "IiJ IDEA" не выводит кирилллицу. */
    }
    /* Далее задача №4 */
    public static void printColor() {
        int value = 122;
        if (value <= 0) System.out.println("Red");
        else if (value > 0 && value <= 100)  System.out.println("Yellow");
        else System.out.println("Green");
        System.out.println();
    }


    /* Далее задача №5 */
    public static void Numbers() {
        int a = 42;
        int b = 17;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
        System.out.println();

        System.out.println("*** The end my HomeWork. Thanks for watching. ***");

    }

}