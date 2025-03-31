public class Lesson5 {

    public static void main(String[] args) {
        int[] linkedList = initializeList(5);
        addToList(linkedList, 10);
        addToList(linkedList, 20);
        addToList(linkedList, 30);
        System.out.println("The index value is 1: " + getValueAtIndex(linkedList, 1));
        System.out.println("List length: " + getListLength(linkedList));

        int[] queue = initializeQueue(5);
        enqueue(queue, 100);
        enqueue(queue, 200);
        System.out.println("Retrieved from the queue: " + dequeue(queue));

        int[] deque = initializeQueue(5);
        addToHead(deque, 300);
        addToTail(deque, 400);
        System.out.println("Extracted from the head: " + removeFromHead(deque));
        System.out.println("Extracted from the tail: " + removeFromTail(deque));
    }

    // Задача 1: Односвязный список
    public static int[] initializeList(int size) {
        return new int[size];
    }

    public static void addToList(int[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                list[i] = value;
                break;
            }
        }
    }

    public static int getValueAtIndex(int[] list, int index) {
        if (index >= 0 && index < list.length) {
            return list[index];
        }
        throw new IndexOutOfBoundsException("The index is out of range");
    }

    public static int getListLength(int[] list) {
        int count = 0;
        for (int value : list) {
            if (value != 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] initializeQueue(int size) {
        return new int[size];
    }

    public static void enqueue(int[] queue, int value) {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == 0) {
                queue[i] = value;
                break;
            }
        }
    }

    public static int dequeue(int[] queue) {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] != 0) {
                int value = queue[i];
                queue[i] = 0;
                return value;
            }
        }
        throw new RuntimeException("The queue is empty");
    }

    public static void addToHead(int[] deque, int value) {
        for (int i = deque.length - 1; i >= 0; i--) {
            if (deque[i] == 0) {
                deque[i] = value;
                break;
            }
        }
    }

    public static int removeFromHead(int[] deque) {
        for (int i = 0; i < deque.length; i++) {
            if (deque[i] != 0) {
                int value = deque[i];
                deque[i] = 0;
                return value;
            }
        }
        throw new RuntimeException("The double queue is empty");
    }

    public static void addToTail(int[] deque, int value) {
        for (int i = 0; i < deque.length; i++) {
            if (deque[i] == 0) {
                deque[i] = value;
                break;
            }
        }
    }

    public static int removeFromTail(int[] deque) {
        for (int i = deque.length - 1; i >= 0; i--) {
            if (deque[i] != 0) {
                int value = deque[i];
                deque[i] = 0;
                return value;
            }
        }
        throw new RuntimeException("The double queue is empty");
    }
}