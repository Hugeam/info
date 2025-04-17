package Lesson9;

import java.util.Random;

public class Older40 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Иванов Иван", "Петров Петр", "Сидоров Сидор", "Андрей Николай", "Алексек Алексей"};
        String[] positions = {"Менеджер", "Разработчик", "Дизайнер", "Аналитик", "Тестировщик"};
        String[] emails = {"example1@mail.com", "example2@mail.com", "example3@mail.com", "example4@mail.com", "example5@mail.com"};
        String[] phones = {"+7 900 000 00 01", "+7 900 000 00 02", "+7 900 000 00 03", "+7 900 000 00 04", "+7 900 000 00 05"};

        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            String fullName = names[random.nextInt(names.length)];
            String position = positions[random.nextInt(positions.length)];
            String email = emails[random.nextInt(emails.length)];
            String phone = phones[random.nextInt(phones.length)];
            double salary = 30000 + random.nextDouble() * 70000;
            int age = 25 + random.nextInt(50);

            employees[i] = new Employee(fullName, position, email, phone, salary, age);
        }

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.displayInfo();
            }
        }
    }
}

