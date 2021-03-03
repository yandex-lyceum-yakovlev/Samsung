package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M_4_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i<n;i++){
            a.add(in.nextInt());
        }

        System.out.println(Collections.max(a));
    }
}
