package Lesson7;

import java.util.Scanner;

import static Lesson7.Cat.appetite;

public class Plate {
    static final Scanner in = new Scanner(System.in);
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

    public static boolean food(int appetite) {
        int foodCount;
        if ((food - appetite) > 0 || (food - appetite) == 0) {
            return true;

        } else return false;
    }

    public static int getFood() {

        return food;
    }

    public boolean checkSatiety(int satiety) {
        if (satiety == appetite) {
            return true;
        } else return false;
    }

    public static void eat(Cat cat) {
        if (food(appetite)) {
            food -= appetite;
            System.out.println("Кот" + " " + Cat.getName() + " " + " съел" + " " + Cat.getAppetite() + " еды");
        } else {
            System.out.println("Коту" + " " + Cat.getName() + " " + "не хватило еды");
            System.out.println("Сколько хотите добавить корма?");
            food = (food + in.nextInt());
        }
//        plate.printInfo();
        //        System.out.printf("%s съел %d корма\n", name, appetite);
        System.out.println("------");

    }
}
