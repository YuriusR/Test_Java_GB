package Lesson10.Task3;

import java.util.ArrayList;

public class Main<E extends Number> {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> appleBox = new Box<>(apple1, apple2, apple3, apple4);
        Box<Orange> orangeBox = new Box<>(orange1, orange2, orange3);

        System.out.println(appleBox.compare(orangeBox));


    }
}
