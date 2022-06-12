package Lesson8.Competition;

import Lesson8.Participant.Participant;

public class Competition {
    private Obstacles[] obstacles;
    private Participant[] participants;

    public void startCompetition() {
        for (Participant participant : participants) {

            if (!passObstacles(participant)) {
                System.out.println();
            }
        }
    }

    private boolean passObstacles(Participant participant) {

        for (Obstacles obstacle : obstacles) {
            if (!participant.doIt(obstacle)) {
                return false;
            }
        }
        return true;
    }

    public void setObstacles(Obstacles[] obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }
}
