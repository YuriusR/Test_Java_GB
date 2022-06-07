package Lesson8;

public class Robot implements Participant {

    private String name;
    private final int run;
    private int jump;
    public Robot(String name, int run, int jump) {
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
