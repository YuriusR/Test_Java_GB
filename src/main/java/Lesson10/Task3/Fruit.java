package Lesson10.Task3;

public abstract class Fruit {
//    private String typeFruits;
    private static double weight;

    static enum TypeFruits {
        APPLE, ORANGE
    }

    public Fruit(double weight) {
//        this.typeFruits = typeFruits;
        this.weight = weight;
    }

//    public String getTypeFruits() {
//        return typeFruits;
//    }
//
//    public void setTypeFruits(String typeFruits) {
//        this.typeFruits = typeFruits;
//    }

    public static double getWeight() {
        return  weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
