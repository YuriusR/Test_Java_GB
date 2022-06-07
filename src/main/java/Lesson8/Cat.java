package Lesson8;

public class Cat implements Participant {
    private String name;
    private int run;
    private int jump;


    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public void run() {


        System.out.println(name + " " + "пробежал");
    }

    public void jump() {
        System.out.println(name + " " + "подпрыгнул");
    }
}
