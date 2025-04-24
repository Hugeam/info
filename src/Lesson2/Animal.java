package Lesson2;

public abstract class Animal {
     static int totalAnimals = 0;
     static int totalDogs = 0;
     static int totalCats = 0;

    public Animal() {
        totalAnimals++;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public static int getTotalDogs() {
        return totalDogs;
    }

    public static int getTotalCats() {
        return totalCats;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}