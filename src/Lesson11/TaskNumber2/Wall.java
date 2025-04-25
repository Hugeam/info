package Lesson11.TaskNumber2;

public class Wall implements Obstacle{
    private final String name;
    private final int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void overcome(Participant participant) {
        if (participant.canJump(height)) {
            participant.jump(height);
            System.out.println("The participant " + participant.getName() + " passed an obstacle " + name + " at the height " + height + " meters.");
        } else {
            System.out.println("The participant " + participant.getName() + " missed an obstacle " + name + " at the height " + height + " meters.");
        }
    }
}
