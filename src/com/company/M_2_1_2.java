package com.company;

import java.util.Scanner;

public class M_2_1_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toOctalString(a));
        System.out.println(Long.toHexString(a));
        System.out.println((-128 <= a && a < 128)?"YES":"NO");
        System.out.println((-32768 <= a && a < 32768)?"YES":"NO");
    }
}
