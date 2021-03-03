package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class M_4_1_bin_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[n];
        long[] b = new long[k];
        for(int i = 0; i<n;i++) a[i] = in.nextLong();
        for(int i = 0; i<k;i++) b[i] = in.nextLong();
        for (long i:b){
            if (Arrays.binarySearch(a, i)<0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}

