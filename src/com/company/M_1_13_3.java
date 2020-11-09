package com.company;

import java.util.Scanner;

public class M_1_13_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int n = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
                n++;
        }
        System.out.println(n + 1);
    }
}
