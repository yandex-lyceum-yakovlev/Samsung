package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class M_4_1_bin_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[n];
        long[] b = new long[k];
        for(int i = 0; i<n;i++) a[i] = in.nextLong();
        for(int i = 0; i<k;i++) b[i] = in.nextLong();
        for (long i:b){

            int j = Arrays.binarySearch(a, i);
            if (j<0)
                System.out.println(0);
            else{
                //System.out.println(j);
                int left = j;
                int right = j;
                while(left >= 0 && a[left] == a[j]) left--;
                while(right < n && a[right] == a[j]) right++;
                System.out.println((left + 2) + " " + right);
            }
        }
    }
}
