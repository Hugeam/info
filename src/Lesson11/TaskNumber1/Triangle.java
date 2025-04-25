package Lesson11.TaskNumber1;

public class Triangle implements Figure {
    private final double base;
    private final double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double area(){
        return 0.5 * base * height;
    }
}
