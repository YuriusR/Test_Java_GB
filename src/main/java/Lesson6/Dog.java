package Lesson6;


public class Dog extends Animal {

    private final static int dogRun = 500;
    private final static int DOG_SWIM = 10;


    public Dog(String name, String animalClass) {
        super(name, animalClass);
    }

    public void run() {
        getRun();
        if (run <= dogRun) {
            System.out.println("Собака пробежала" + SPASE + run + SPASE + "метра(ов)");
        } else System.out.println("Собака не в силах пробежать более" + SPASE + dogRun + SPASE + "метров.");
    }

    public void swim() {
        getSwimming();
        if (swimming <= DOG_SWIM) {
            System.out.println("Собака легко проплывает" + SPASE + swimming + SPASE + "метра(ов)");
        } else System.out.println("Собака не в силах проплыть более" + SPASE + DOG_SWIM + SPASE + "метров.");
    }
}
