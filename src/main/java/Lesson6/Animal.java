package Lesson6;

import java.util.Scanner;

public abstract class Animal {

    public static String SPASE = " ";
    private String name;
    private String animalClass;
    public int run;
    public int swimming;
    Scanner in = new Scanner(System.in);


    public Animal(String name, String animalClass) {
        this.name = name;
        this.animalClass = animalClass;
        this.run = Math.abs(run);
        this.swimming = Math.abs(swimming);
    }

    void printInfo() {System.out.println(this);}

    @Override
    public String toString() {
        return String.format("Имя зверя: %s\nКласс зверя: %s\n", name, animalClass);
    }

    public abstract void run();

    public abstract void swim();

    public int getRun() {
        System.out.println("Введите дистанцию для бега:");
        run = in.nextInt();
        return run;
    }
    public int getSwimming() {
        System.out.println("Введите дистанцию для плавания:");
        swimming = in.nextInt();
        return swimming;
    }

    public String getName() {
        return name;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public static void action(Animal animal) {
        animal.run();
        animal.swim();
    }
}
