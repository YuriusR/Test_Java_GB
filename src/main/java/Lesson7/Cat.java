package Lesson7;

public class Cat {

    public String name;
    public int appetite;
    public boolean satiety = false;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
