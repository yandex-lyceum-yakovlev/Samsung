package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if (Character.isUpperCase(a.charAt(0)))
            System.out.println(a.toLowerCase());
        else
            System.out.println(a.toUpperCase());
    }
}


