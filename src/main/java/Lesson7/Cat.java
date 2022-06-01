package Lesson7;

public class Cat {

    public String name;
    public int appetite;
    public boolean satiety = false;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public boolean isSatiety() {

        return satiety;
    }
    public static boolean checkSatiety(int satiety, int appetite) {
        if (satiety == appetite) {
            return true;
        } else return false;
    }
    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
