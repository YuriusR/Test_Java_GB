package Lesson7;

import java.util.Arrays;

import static Lesson7.Plate.in;

public class MainClass {


    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Барсик", 4);
        Cat cat2 = new Cat("Максик", 5);
        Cat cat3 = new Cat("Мартин", 6);
        Cat cat4 = new Cat("Кисан", 3);
        Plate plate = new Plate(10);
        plate.printInfo();

        Cat[] cats = {cat1, cat2, cat3, cat4};

        int satietyCount = 0;
        while (satietyCount != cats.length) {
            for (Cat cat : cats) {
                if (!cat.satiety) {
                    if ((plate.food - cat.appetite) > 0 || (plate.food - cat.appetite) == 0) {
                        cat.eat(plate);
                        System.out.println("Кот" + " " + cat.name + " " + " съел" + " " + cat.appetite + " еды");
                        satietyCount += 1;
                        cat.satiety = true;
                        plate.printInfo();
                    } else {
                        System.out.println("Коту" + " " + cat.name + " " + "не хватило еды");
                    }
                }

                else System.out.println("Кот" + " " + cat.name + "— сытый");
                Thread.sleep(1000);
            }

            System.out.println("**************");
            for (Cat cat : cats) {
                if (cat.satiety) {
                    System.out.println("Кот" + " " + cat.name + "— сытый");
                } else {
                    System.out.println("Кот" + " " + cat.name + "— голоден");
                }
            }

            System.out.println("Сколько хотите добавить корма?");
            plate.food = (plate.food + in.nextInt());
            plate.printInfo();
        }

        System.out.println("УРРА! Все кошки сыты!");
    }
}
