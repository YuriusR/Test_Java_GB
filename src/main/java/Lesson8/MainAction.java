package Lesson8;

import Lesson8.Competition.Competition;
import Lesson8.Competition.Obstacles;
import Lesson8.Competition.Treadmill;
import Lesson8.Competition.Wall;
import Lesson8.Participant.Cat;
import Lesson8.Participant.Human;
import Lesson8.Participant.Participant;
import Lesson8.Participant.Robot;

import java.util.Arrays;

public class MainAction {

    public static void main(String[] args) {

        Cat cat = new Cat("Кот","Барсик", 300, 5);
        Robot robot = new Robot("Робот","AI_Boston", 500, 1);
        Human human = new Human("Человек","Галиаф", 3000, 2);
        Wall wall = new Wall(4);
        Treadmill treadmill = new Treadmill(1000);


        Participant[] participant = {cat, robot, human};
        Obstacles[] obstacles = {wall, treadmill};
        Competition competition = new Competition();
        competition.setObstacles(obstacles);
        competition.setParticipants(participant);

        System.out.println("Участники:" + Arrays.toString(participant));
        System.out.println( );
        competition.startCompetition();

        /*for (Participant participant1 : participant) {
            for (Obstacles obstacle : obstacles) {

                competition(participant1, obstacle);
            }

        }*/


    }



   /* public static void competition(Participant participant, Obstacles obstacles) {

        participant.run(obstacles);
        participant.jump(obstacles);

    }*/
}
