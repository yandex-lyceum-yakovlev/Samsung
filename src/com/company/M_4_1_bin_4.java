package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class M_4_1_bin_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        Set<Integer> mySet = new HashSet<>(Arrays.asList(a));
        System.out.print(mySet.size());
    }
}
