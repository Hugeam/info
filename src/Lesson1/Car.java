package Lesson1;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("The electrical system is running.");
    }

    private void startCommand() {
        System.out.println("The command system is running.");
    }

    private void startFuelSystem() {
        System.out.println("The fuel system is running.");
    }
}
