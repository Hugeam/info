package Lesson11.TaskNumber2;

public class Robot implements Participant {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        System.out.println(name + " runs on " + distance + " meters.");
    }

    public void jump(int height) {
        System.out.println(name + " jump on " + height + " meters.");
    }

    public boolean canRun(int distance) {
        return distance <= maxRunDistance;
    }

    public boolean canJump(int height) {
        return height <= maxJumpHeight;
    }
}
