package Lesson7;

public class Cat {

    private static String name;
    public static int appetite;
    public static boolean satiety = false;


    public Cat(String name, int appetite) {
        Cat.name = name;
        Cat.appetite = appetite;
    }



    public static void eat(Plate plate) {
        if (!satiety) {
            System.out.println("Кот" + " " + getName() + " " + " съел" + getAppetite() + " еды");
            satiety=true;
        }


        plate.printInfo();
        Plate.food(appetite);
//        System.out.printf("%s съел %d корма\n", name, appetite);
        System.out.println("------");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static String getName() {
        return name;
    }
    public static int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
