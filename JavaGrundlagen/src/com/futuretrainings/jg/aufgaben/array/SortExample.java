package com.futuretrainings.jg.aufgaben.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortExample {
    public static void main(String[] args) {
        int count;
        int[] numbers;
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Wieviele Zahlen willst du eingeben? ");
        count = sc.nextInt();
        numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". Zahl: ");
            numbers[i] = sc.nextInt();
        }

        // Sort
        Arrays.sort(numbers);

        // Output
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
