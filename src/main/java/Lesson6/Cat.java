package Lesson6;

public class Cat extends Animal {

    private final static int CAT_RUN = 200;

    public Cat(String name, String animalClass) {
        super(name, animalClass);
    }

    public void run() {
        getRun();
        if (run <= CAT_RUN) {
            System.out.println(getAnimalClass() + SPASE + getName() + SPASE + "пробежал(а)" + SPASE + run + SPASE + "метров");
        } else System.out.println("Кошки бегают не более чем на" + SPASE + CAT_RUN + SPASE + "метров.");
    }

    public void swim() {
        System.out.println("Кошки плавать не умеют!");
    }
}
