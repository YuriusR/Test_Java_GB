package Lesson10.Task3;

public class Fruit {
    private String typeFruits;
    private int weight;

    static enum TypeFruits {
        APPLE, ORANGE
    }

    public Fruit(String typeFruits, int weight) {
        this.typeFruits = typeFruits;
        this.weight = weight;
    }

    public Fruit() {


    }
}
