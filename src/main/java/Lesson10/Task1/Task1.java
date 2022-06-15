package Lesson10.Task1;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args){
        String[] massiv = {"A", "B" ,"C", "D", "E"};
        System.out.println(Arrays.toString(massiv));

        String chengeMassiv=massiv[2];
        massiv[2]=massiv[4];
        massiv[4]= chengeMassiv;
        System.out.println(Arrays.toString(massiv));
    }
}
