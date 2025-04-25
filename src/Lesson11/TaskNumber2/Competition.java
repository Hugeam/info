package Lesson11.TaskNumber2;

import java.util.List;

public class Competition {
    private final List<Participant> participants;
    private final List<Obstacle> obstacles;

    public Competition(List<Participant> participants, List<Obstacle> obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void start() {
        for (Participant participant : participants) {
            boolean isDisqualified = false;
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);

                if (obstacle instanceof Treadmill && !participant.canRun(((Treadmill) obstacle).getLength())) {
                    System.out.println("Participant " + participant.getName() + " missed an obstacle " + obstacle.getName() + ". Completed: " + obstacle.getName());
                    isDisqualified = true;
                    break;
                }
            }
            if (!isDisqualified) {
                System.out.println("Participant " + participant.getName() + " Successfully passed all the obstacles. ");
            }
        }
    }
}