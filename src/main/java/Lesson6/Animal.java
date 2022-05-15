package Lesson6;

import java.util.Scanner;

public class Animal {

    private String name;
    private String animalClass;
    public int run;
    public int swimming;
    Scanner in = new Scanner(System.in);


    public Animal(String name, String animalClass, int run, int swimming) {
        this.name = name;
        this.animalClass = animalClass;
        this.run = Math.abs(run);
        this.swimming = Math.abs(swimming);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalClass='" + animalClass + '\'' +
                ", run=" + run +
                ", swimming=" + swimming +
                ", in=" + in +
                '}';
    }

    void printInfo() {
        System.out.println(this);
    }

    public void run() {



    }

    public void swim() {

    }

    public int getRun() {
        System.out.println("¬ведите дистанцию дл€ бега:");
        run = in.nextInt();
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwimming() {
        System.out.println("¬ведите дистанцию дл€ плавани€:");
        swimming = in.nextInt();
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }
}
