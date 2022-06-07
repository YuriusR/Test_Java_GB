package Lesson8;

public class Human implements Participant {

    private String name;
    private int run;
    private int jump;


    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public void run(){
        System.out.println(name + " " + "пробежал");
    }
    public void jump(){
        System.out.println(name + " " + "подпрыгнул");
    }
}
