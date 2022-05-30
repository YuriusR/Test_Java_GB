package Lesson7;

import java.util.Arrays;

public class MainClass {


    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Барсик", 4);
        Cat cat2 = new Cat("Максик", 5);
        Cat cat3 = new Cat("Боня", 6);
        Cat cat4 = new Cat("Рыся", 3);
        Plate plate = new Plate(10);
        plate.printInfo();

        Cat[] cats = {cat1, cat2, cat3, cat4};

        for (Cat cat : cats) {
            Plate.eat(cat);
            /*else System.out.println("Коту" + " " + cat.getName() + " " + "не хватило еды")*/
            ;
            plate.printInfo();
            Thread.sleep(1000);
        }
        System.out.println("УРРА! Все кошки сыты");

        /*while (plate.getFood() > 0) {
            //System.out.println("В тарелку упало ещё" + plate.getFood());
            Cat.eat(plate);

            plate.printInfo();
            Thread.sleep(1000);
        }*/
    }

}
