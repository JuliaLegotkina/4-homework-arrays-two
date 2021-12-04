package ru.skypro;

public class Main {
    public static int[] randomNumberGenerator() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        System.out.println("Задание один");

        int[] arr = randomNumberGenerator();
        int generalAmount = -1;

        for (int i : arr) {
            generalAmount += i;
        }

        System.out.println("За месяц было потрачено " + generalAmount + " руб.");

        System.out.println("Задание два");

        int maxAmount = Integer.MIN_VALUE;
        int minAmount = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > maxAmount) {
                maxAmount = i;
            }
            if (i < minAmount) {
                minAmount = i;
            }
        }
        System.out.println("Минимальные затраты в день " + minAmount + " руб.");
        System.out.println("Максимальные затраты в день " + maxAmount + " руб.");

        System.out.println("Задание три");

        int averageAmount = -1;
        for (int i : arr) {
            averageAmount += i;
        }

        System.out.println("В среднем за день тратилось " + averageAmount / arr.length + " руб.");

        System.out.println("Задание четыре");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}