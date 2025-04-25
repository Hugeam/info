package Lesson12.Task1;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "eleven", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            int result = calculator.doCalc(validArray);
            System.out.println("The sum of the array elements : " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            int result = calculator.doCalc(invalidArray);
            System.out.println("The sum of the array elements : " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            int result = calculator.doCalc(wrongSizeArray);
            System.out.println("The sum of the array elements : " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

