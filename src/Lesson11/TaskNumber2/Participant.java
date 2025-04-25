package Lesson11.TaskNumber2;

public interface Participant {
    String getName();
    void run(int distance);
    void jump(int height);
    boolean canRun(int distance);
    boolean canJump(int height);
}