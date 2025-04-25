package Lesson11.TaskNumber2;

import java.util.ArrayList;
import java.util.List;


public class CompetitionsGO {
    public static void main(String[] args) {

        List<Participant> participants = new ArrayList<>();
        participants.add(new Human(" Human ", 100, 2));
        participants.add(new Cat(" Cat ", 50, 1));
        participants.add(new Robot(" Robot ", 200, 3));


        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Treadmill(" Treadmill " , 80));
        obstacles.add(new Wall(" Wall ", 1));

        Competition competition = new Competition(participants, obstacles);
        competition.start();
    }
}