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



    public void run(Obstacles obstacles) {

        if ((obstacles.getLengthTreadmill()) <= run) {
            System.out.println(name + " " + "пробежал по дорожке");
        } else
            System.out.println(name + " " + "не смог пробежать и сходит с дистанции");

    }

    public void jump(Obstacles obstacles) {
        if (obstacles.getHeightWall() <= jump){
            System.out.println(name + " " + "перепрыгнул стену");
        } else System.out.println(name + " " + "не смог перепрыгнуть эту стену и сходит с дистанции");

    }
}
