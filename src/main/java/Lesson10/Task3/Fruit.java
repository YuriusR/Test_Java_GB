package Lesson10.Task3;

public abstract class Fruit {

    private static double weight;

    static enum TypeFruits {
        APPLE, ORANGE
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    public static double getWeight() {
        return  weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
