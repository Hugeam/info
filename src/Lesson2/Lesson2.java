package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Корги");
        Dog dog2 = new Dog("Лабрадор");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Барсик");

        dog1.run(150);
        dog1.swim(5);
        dog2.run(600);
        dog2.swim(15);

        cat1.run(100);
        cat1.swim(10);
        cat2.run(250);
        cat2.swim(5);

        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
        System.out.println("Количество собак: " + Animal.getTotalDogs());
        System.out.println("Количество котов: " + Animal.getTotalCats());
    }
}
