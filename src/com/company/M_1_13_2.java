package com.company;

import java.util.Scanner;

public class M_1_13_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if (Character.isUpperCase(a.charAt(0)))
            System.out.println(a.toLowerCase());
        else
            System.out.println(a.toUpperCase());
    }
}
