package Lesson10.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <E extends Fruit> {

    private ArrayList<E> listFruit;
    public Box(E...arrayList) {
        this.listFruit = new ArrayList<E>(Arrays.asList(arrayList));


    }
    public void add(E... arrayList) {
        this.listFruit.addAll(Arrays.asList(arrayList));
    }

    public ArrayList<E> getListFruit() {
        return new ArrayList<E>(listFruit);
    }


    public float getWeight(E...arreyList) {
        if (listFruit.size() == 0) return 0;
        float weight = 0;
        for (E item: listFruit)
            weight += Fruit.getWeight();
        return weight;
    }
    public boolean  compare(Box box){
        return this.getWeight() == getWeight();
    }
}
