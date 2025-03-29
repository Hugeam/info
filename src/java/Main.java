import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] binaryArray = new int[]{0, 1, 0, 1, 0, 1, 0};
        invertArray(binaryArray);
        int[] newArray = new int[100];
        emptyIntegerArray(newArray);
        int[] arrayInstance = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        initializedArray(arrayInstance);
        System.out.println(Arrays.toString(arrayInstance));
        int size = 5;
        int[][] matrix = new int[size][size];
        fillMainDiagonal(matrix);
        System.out.println("An array with a filled main diagonal:");
        printArray(matrix);
        int[][] matrix2 = new int[size][size];
        fillDiagonals(matrix2);
        System.out.println("An array with filled main and additional diagonals:");
        printArray(matrix2);
        int len = 10;
        int initialValue = 5;
        int[] initializedArray = initializeArrayA(len, initialValue);
        System.out.println("Initialized array: " + Arrays.toString(initializedArray));
        int[] array = new int[]{3, 5, 1, 8, 2, 7, 4, 6, 9, 10};
        findMinMax(array);
        int[] array1 = new int[]{1, 2, 3, 4, 6};
        boolean isBalanced = findBalance(array1);
        System.out.println("Balance found: " + isBalanced);
    }

    public static void invertArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }

        System.out.println("Modified array: " + Arrays.toString(array));
    }

    public static void emptyIntegerArray(int[] ignoredArray) {
        int[] newArray = new int[100];

        for(int i = 0; i < newArray.length; ++i) {
            newArray[i] = i + 1;
        }

        System.out.println("Modified1 array: " + Arrays.toString(newArray));
    }

    public static void initializedArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

    }

    public static void fillMainDiagonal(int[][] array) {
        for(int i = 0; i < array.length; ++i) {
            array[i][i] = 1;
        }

    }

    public static void fillDiagonals(int[][] array) {
        for(int i = 0; i < array.length; ++i) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }

    }

    public static void printArray(int[][] array) {
        for(int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
    }

    public static int[] initializeArrayA(int len, int initialValue) {
        int[] array = new int[len];

        for(int i = 5; i < array.length; ++i) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void findMinMax(int[] array) {
        if (array.length == 0) {
            System.out.println("The array is empty.");
        } else {
            int min = array[0];
            int max = array[0];

            for(int i = array.length - 1; i >= 0; --i) {
                if (array[i] < min) {
                    min = array[i];
                }

                if (array[i] > max) {
                    max = array[i];
                }
            }

            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        }
    }

    public static boolean findBalance(int[] array1) {
        int totalSum = 0;

        for(int num : array1) {
            totalSum += num;
        }

        int leftSum = 0;

        for(int j : array1) {
            int rightSum = totalSum - leftSum - j;
            if (leftSum == rightSum) {
                return true;
            }

            leftSum += j;
        }

        return false;
    }
}
