package Lesson8.Competition;

import Lesson8.Participant.Participant;

public class Treadmill implements Obstacles {
    private final int lengthTreadmill;

    public Treadmill(int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;
    }

    public boolean competition(Participant participant) {
//        System.out.println("participant = " + participant);
        if (participant.run() > lengthTreadmill){
            System.out.println("пробежал по дорожке");
            return true;
        }
        else {
            System.out.println("не смог пробежать и сходит с дистанции");
            return false;
        }
    }

}
