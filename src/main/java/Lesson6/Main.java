package Lesson6;

import java.util.Arrays;

public class Main {

    public void main(String name, String animalClass, int run, int swimming) {

        Dogs dogs = new Dogs("Doby", "собака", run, swimming);
        System.out.println("name = " + name + ", animalClass = " + animalClass + ", run = " + run + ", swimming = " + swimming);

    }
}
