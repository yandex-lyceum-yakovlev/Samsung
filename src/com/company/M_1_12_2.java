package com.company;

import java.util.Scanner;

public class M_1_12_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = 0;
        while (a > 0 && b > 0){
            if (a > b) a -= b;
            else b -= a;
            k++;
        }
        System.out.format("%d %d", a + b, k);
    }
}
