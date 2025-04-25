package Lesson11.TaskNumber1;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
