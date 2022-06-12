package Lesson8.Competition;

import Lesson8.Participant.Participant;

public class Wall implements Obstacles {

    private final int heightWall;
    private final String obstacleClass;

    public Wall(String obstacleClass, int heightWall) {
        this.heightWall = heightWall;
        this.obstacleClass = obstacleClass;
    }

    public boolean competition(Participant participant) {

        if (participant.jump() > heightWall) {
            System.out.println("успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println("не смог перепрыгнуть препятствие и сходит с дистанции");
            return false;
        }
    }

    public String toString() {
        return String.format("%n %s высотой: %d%n", obstacleClass, heightWall);
    }
}
