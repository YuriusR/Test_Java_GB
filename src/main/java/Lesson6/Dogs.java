package Lesson6;


public class Dogs extends Animal {

    private static int DOG_RUN = 500;
    private static int DOG_SWIM = 10;


    public Dogs(String name, String animalClass, int run, int swimming) {
        super(name, animalClass, run, swimming);


    }

    public void run() {

        if (run <= DOG_RUN) {
            System.out.println("������" + getName() + "���������" + run + "������");
        }else System.out.println("������ �� � ����� ��������� �����" + DOG_RUN + "������.");
    }
}
