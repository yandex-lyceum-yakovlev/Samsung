package com.company;

import java.util.Locale;
import java.util.Scanner;

public class M_4_1_bin_5 {
    static int a;
    static int b;
    static int c;
    static int d;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        double left = -10000;
        double right = 10000;
        while (right - left > 0.000000001) {
            double mid = (right + left) / 2.0000d;
            if (f(left) * f(mid) < 0)
                right = mid;
            else
                left = mid;
        }
        System.out.printf(Locale.ENGLISH,"%.10f", left);
    }
    static double f(double x){
        return a * x * x * x + b * x * x + c * x + d;
    }
}
