package Lesson11.TaskNumber2;

public class Treadmill implements Obstacle{
    private final String name;
    private final int length;

    public Treadmill(String name, int length){
        this.name = name;
        this.length = length;
    }
    public String getName(){
        return name;
    }
    public int getLength(){
        return length;
    }

    public void overcome(Participant participant) {
     if(participant.canRun(length)){
         participant.run(length);
         System.out.println(" The participant " + participant.getName() + "passed the obstacle " + name +" at a distance of " + length + " meters " );
        }else{
         System.out.println(" The participant " + participant.getName() + " failed ");
        }
    }
}
