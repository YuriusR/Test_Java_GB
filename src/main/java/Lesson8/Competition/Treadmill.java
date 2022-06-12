package Lesson8.Competition;

import Lesson8.Participant.Participant;

public class Treadmill implements Obstacles {
    private final int lengthTreadmill;
    private final String obstacleClass;

    public Treadmill(String obstacleClass, int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;
        this.obstacleClass = obstacleClass;
    }


    public boolean competition(Participant participant) {

        if (participant.run() > lengthTreadmill){
            System.out.println("пробежал по дорожке");
            return true;
        }
        else {
            System.out.println("не смог пробежать и сходит с дистанции");
            return false;
        }
    }
    public String toString() {
        return String.format("%n %s длиной: %d%n", obstacleClass, lengthTreadmill);
    }
}
