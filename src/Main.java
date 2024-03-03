import java.util.Arrays;
import java.util.Random;

public class Main {
    private final static int DAYS = 30;

    public static void main(String[] args) {
        System.out.println("Task1");
        task1();
        System.out.println("Task2");
        task2Commit();
        task2();
        System.out.println("Task3");
        task3();
        System.out.println("Task4");
        task4();

    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[DAYS];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int daySum : arr) {
            sum += daySum;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей %n", sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.printf("Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная сумма трат за день составила %d рублей %n", min, max);
    }

    public static void task2Commit() {
        int[] arr = generateRandomArray();
        int min = 99999;
        int max = 200_001;
        for (int val : arr) {
            if (val < max) min = val;
        }
        for (int val : arr) {
            if (val > min) max = val;
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная сумма трат за день составила %d рублей %n", min, max);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int daySum : arr) {
            sum += daySum;
        }
        double average = (double) sum / DAYS;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей %n", average);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}