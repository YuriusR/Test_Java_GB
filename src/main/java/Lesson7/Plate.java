package Lesson7;

import java.util.Scanner;

//import static Lesson7.Cat.appetite;

public class Plate {
    static final Scanner in = new Scanner(System.in);
    public   int food;

    public Plate(int food) {
        this.food = Math.abs(food);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "В тарелке" + " " + food + " " + "еды";
    }

    public boolean food(int appetite) {

        if ((food - appetite) > 0 || (food - appetite) == 0) {
            return true;

        } else return false;
    }

    public int getFood() {

        return food;
    }

    /*public static boolean checkSatiety(int satiety, int appetite) {
        if (satiety == appetite) {
            return true;
        } else return false;
    }*/

    public void eat(Cat cat) {

        if (food(cat.getAppetite())) {
            food -= cat.appetite;
            System.out.println("Кот" + " " + cat.name + " " + " съел" + " " + cat.appetite + " еды");
        } else {
            System.out.println("Коту" + " " + cat.name + " " + "не хватило еды");
            System.out.println("Сколько хотите добавить корма?");
            food = (food + in.nextInt());
        }
//        plate.printInfo();
        //        System.out.printf("%s съел %d корма\n", name, appetite);
        System.out.println("------");

//        return cat;
    }
}
