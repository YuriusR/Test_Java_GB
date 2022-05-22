package Lesson6;

import java.util.Arrays;

public class MainApp {
    static int animalsCount = 0;
    static int dogsCount = 0;
    static int catsCount = 0;
    private static Animal Object;

    public static void main(String[] args) {

        Dog dog1 = new Dog("Доби", "Dog");
        Dog dog2 = new Dog("Келли", "Dog");
        Cat cat1 = new Cat("Мурзик", "Cat");

        Animal[] animals = {dog1, dog2, cat1};

        for (Animal animal : animals) {
            animalsCount++;
            Object = animal;
            animal.printInfo();
            Animal.action(Object);
            System.out.println("-----------");
            if (animal.getAnimalClass() == "Dog") {
                dogsCount++;
            } else catsCount++;

        }

        System.out.println("Всего животных:" + animalsCount);
        System.out.println("Из них собак:" + dogsCount);
        System.out.println("Кошек:" + catsCount);
    }
}
