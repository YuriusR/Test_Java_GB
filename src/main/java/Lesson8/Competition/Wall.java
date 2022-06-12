package Lesson8.Competition;

import Lesson8.Participant.Participant;

public class Wall implements Obstacles {

    private final int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    public boolean competition(Participant participant) {

        if (participant.jump() > heightWall){
            System.out.println("успешно перепрыгнул стену");
            return true;
        }
        else {
            System.out.println("не смог перепрыгнуть препятствие и сходит с дистанции");
            return false;
        }
    }
}
