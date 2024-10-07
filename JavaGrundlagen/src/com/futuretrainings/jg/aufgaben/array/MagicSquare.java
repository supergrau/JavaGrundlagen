package com.futuretrainings.jg.aufgaben.array;

import javax.swing.*;

/**
 * Create a magic square
 */
public class MagicSquare {
    public static void main(String[] args) {
        // Input
        int n = 0;
        while ((n % 2 == 0) || (n > 9) || (n < 3)) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Bitte einen ungeraden, ganzzahligen Wert zwischen 2 und 10 eingeben"));
        }

        // Calculation
        int[][] square = new int[n][n];
        int row =  n / 2;
        int column = n / 2 + 1;

        for (int i = 1; i <= n * n; i++) {
            square[row][column] = i;
            row = row - 1;
            column = column + 1;
            if (row < 0) row = n - 1;
            if (column == n) column = 0;
            if (square[row][column] != 0) {
                row = row + 1;
                column = column + 1;
                if (row == n) row = 0;
                if (column == n) column = 0;
            }
        }

        // Output
        for (int i=0; i<n-1;i++)
            System.out.print("+----");
        System.out.println("+----+");
        for (int[] ints : square) {
            System.out.print("|");
            for (int anInt : ints) {
                if (anInt < 10)
                    System.out.print(" ");
                System.out.print(" " + anInt);
                System.out.print(" |");
            }
            System.out.println();
            for (int i=0; i<n-1;i++)
                System.out.print("+----");
            System.out.println("+----+");
        }
    }
}
