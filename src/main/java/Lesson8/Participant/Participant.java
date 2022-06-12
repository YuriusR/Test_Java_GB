package Lesson8.Participant;

import Lesson8.Competition.Jump;
import Lesson8.Competition.Obstacles;
import Lesson8.Competition.Run;

public interface Participant extends Run, Jump {
    default boolean doIt(Obstacles obstacles) {
        return obstacles.competition(this);
    }

}
