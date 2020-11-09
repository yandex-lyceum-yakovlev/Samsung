package com.company;

import java.util.Scanner;

public class M_1_13_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char c = a.charAt(0);
        if (c >= '0' && c <= '9')
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
