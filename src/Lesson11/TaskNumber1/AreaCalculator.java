package Lesson11.TaskNumber1;

public class AreaCalculator {
    public static double totalArea(Figure[] figures){
        double total = 0;
        for (Figure figure : figures){
            total += figure.area();
        }
        return total;
    }
}
