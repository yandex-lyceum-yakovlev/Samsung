package com.company;

import java.util.Scanner;

import java.util.*;

public class M_1_11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] a = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i + j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
