package Lesson8.Participant;

public class Robot implements Participant {

    private final String participantClass;
    private final String name;
    private final int run;
    private final int jump;


    public Robot(String participantClass, String name, int run, int jump) {

        this.name = name;
        this.run = run;
        this.jump = jump;
        this.participantClass = participantClass;
    }


    public int run() {

        System.out.printf("%s %s бежит по треку%n", participantClass, name);
        return run;
    }

    public int jump() {

        System.out.printf("%s %s прыгает%n", participantClass, name);
        return jump;
    }
    public String toString() {
        return String.format("%n %s %s%n Бег на дистанцию: %s%n Прыгает на высоту: %s%n", participantClass, name, run, jump);
    }
}
