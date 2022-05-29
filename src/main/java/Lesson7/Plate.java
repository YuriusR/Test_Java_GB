package Lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Plate {

    private static int food;

    public Plate(int food) {
        Plate.food = Math.abs(food);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "В тарелке" + " " + food + " " + "еды";
    }

    public static void food(int appetite) {
        int foodCount;
        if ((food-appetite) >0 || (food-appetite) == 0) {
            food -= appetite;
        }else System.out.println("Коту" + " " + Cat.getName() + " " + "не хватило еды");



        //food += ThreadLocalRandom.current().nextInt((2)+3);
    }

    public int getFood() {

        return food;
    }

    public boolean checkSatiety(int satiety) {

        return false;
    }
}
