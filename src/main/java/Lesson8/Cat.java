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
