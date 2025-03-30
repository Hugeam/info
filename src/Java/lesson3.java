public class lesson3 {
    public lesson3() {
    }

    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        checkSumSign();
        printColor();
        compareNumbers();
        boolean result = checkSum(6, 8);
        System.out.println(result);
        checkPositive(-10);
        boolean result2 = isPositive(20);
        System.out.println(result2);
        isPositive(20);
        checkLeapYear(2024);
    }

    public static void checkSumSign() {
        int a = 6;
        int b = 8;
        if (a + b >= 0) {
            System.out.println("The amount is positive");
        } else if (a + b < 0) {
            System.out.println("The amount is negative");
        }

    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }

    }

    public static void compareNumbers() {
        int a = 13;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositive(int a) {
        if (a >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

    }

    public static boolean isPositive(int a) {
        return a < 0;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year == 400;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " It is a leap year ");
        } else {
            System.out.println(year + " It is not a leap year ");
        }

    }
}


