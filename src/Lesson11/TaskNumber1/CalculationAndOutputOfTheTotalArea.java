package Lesson11.TaskNumber1;

public class CalculationAndOutputOfTheTotalArea {
    public static void main(String[] args){
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5);
        figures[1] = new Triangle(4,3);
        figures[2] = new Square(2);

        double totalArea = AreaCalculator.totalArea(figures);
        System.out.println("The total area of all the shapes" + totalArea);
    }
}
