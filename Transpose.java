package com.ritesh;

import java.util.Scanner;
//Transpose Matrix
public class Transpose {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        System.out.println("Enter Array Data:\n");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("\n");

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

