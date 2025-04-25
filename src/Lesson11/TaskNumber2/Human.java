package Lesson11.TaskNumber2;

public class Human implements Participant{
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName(){
        return name;
    }

    public void run(int distance){
        System.out.println(name + " runs on " + " meters.");
    }

    public void jump(int height){
        System.out.println(name + " jump on" + " meters.");
    }

    public boolean canRun(int distance){
        return distance <= maxRunDistance;
    }

    public boolean canJump(int height){
        return height <= maxJumpHeight;
    }
}
