package com.company;

import java.util.*;

public class M_1_11_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] a = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println(m + " "+ n);
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
