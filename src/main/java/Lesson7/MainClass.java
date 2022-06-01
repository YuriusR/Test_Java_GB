package Lesson7;

import java.util.Arrays;

//import static Lesson7.Plate.checkSatiety;
import static Lesson7.Plate.in;

public class MainClass {


    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Барсик", 4, false);
        Cat cat2 = new Cat("Максик", 5, false);
        Cat cat3 = new Cat("Мартин", 6,false);
        Cat cat4 = new Cat("Кисан", 3, false);
        Plate plate = new Plate(10);
        plate.printInfo();

        Cat[] cats = {cat1, cat2, cat3, cat4};

        for (Cat cat : cats) {
           /* if (plate.food(cat.getAppetite())) {
                plate.eat(cat);
                System.out.println("Кот" + " " + cat.name + " " + " съел" + " " + cat.appetite + " еды");
            } else {
                System.out.println("Коту" + " " + cat.name + " " + "не хватило еды");
                System.out.println("Сколько хотите добавить корма?");
                plate.food = (plate.food + in.nextInt());*/
            plate.eat(cat);
            if (cat.isSatiety()){
                cat.satiety = true;
                System.out.println("Кот сыт");
            }
//        plate.printInfo();
            //        System.out.printf("%s съел %d корма\n", name, appetite);


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
