import java.util.Arrays;

    public class Lesson6 {

        public static void main(String[] args) {

            int[] source1 = {1, 2, 3, 4};
            int[] target1 = {};
            int[] result1 = arrayCopy(source1, target1);
            System.out.println("The result of copying (example 1): " + Arrays.toString(result1));

            int[] source2 = {1, 2, 3, 4};
            int[] target2 = {5, 6, 7};
            int[] result2 = arrayCopy(source2, target2);
            System.out.println("The result of copying (example 2): " + Arrays.toString(result2));

            int[] arrayToSort = {5, 3, 8, 4, 2};
            System.out.println("The original array: " + Arrays.toString(arrayToSort));
            shakerSort(arrayToSort);
            System.out.println("Sorted array: " + Arrays.toString(arrayToSort));
        }

        public static int[] arrayCopy(int[] source, int[] target) {

            int[] result = new int[target.length + source.length];

            System.arraycopy(target, 0, result, 0, target.length);

            System.arraycopy(source, 0, result, target.length, source.length);

            return result;
        }

        public static void shakerSort(int[] array) {
            boolean swapped;
            int start = 0;
            int end = array.length - 1;

            do {
                swapped = false;

                for (int i = start; i < end; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
                }

                end--;

                swapped = false;

                for (int i = end; i > start; i--) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        swapped = true;
                    }
                }

                start++;

            } while (swapped);
        }
    }

