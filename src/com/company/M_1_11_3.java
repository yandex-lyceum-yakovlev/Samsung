package com.company;

import java.util.Scanner;

public class M_1_11_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] a = new int [n][n];

        // Ввод массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        String f = "yes";
        loop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    f = "no";
                    break loop;
                }
            }
        }
        System.out.println(f);
    }
}
