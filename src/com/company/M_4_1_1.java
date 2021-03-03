package com.company;

import java.util.Scanner;


public class M_4_1_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int k = 0;
        for(int i = 0; i<n-1;i++){
            int b = in.nextInt();
            if (b > a)
                k++;
            a = b;
        }
        System.out.println(k);
    }
}
