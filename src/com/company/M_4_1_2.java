package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class M_4_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> a = new LinkedList<>();
        for(int i = 0; i<n;i++){
            a.add(in.nextInt());
        }
        a.add(0, a.get(n-1));
        a.remove(n);
        for(Integer i:a)
            System.out.print(i + " ");
    }
}
