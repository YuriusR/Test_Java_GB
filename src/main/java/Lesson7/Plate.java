package Lesson7;

import java.util.Scanner;

public class Plate {
    static final Scanner in = new Scanner(System.in);
    public   int food;

    public Plate(int food) {
        this.food = food;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "В тарелке" + " " + food + " " + "еды";
    }
    public void decreaseFood(int n) {
        food -= n;
    }
}
