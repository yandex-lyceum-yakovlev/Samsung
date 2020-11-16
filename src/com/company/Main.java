package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        for(a = 0; a <= 1; a++)
            for(b=-1; b <=0; b++)
                System.out.print((a == 0 || b == -1) + " ");
        System.out.println();
        for(a = 0; a <= 1; a++)
            for(b=-1; b <=0; b++)
                System.out.print((a != 0 && b != -1) + " ");
        System.out.println();

    }
}


