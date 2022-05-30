package Lesson7;

public class Cat {

    private static String name;
    public static int appetite;
    public static boolean satiety = false;


    public Cat(String name, int appetite) {
        Cat.name = name;
        Cat.appetite = appetite;
    }

    public static boolean isSatiety() {
        return satiety;
    }

    public static String getName() {
        return name;
    }
    public static int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
