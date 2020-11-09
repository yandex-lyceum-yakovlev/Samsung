package com.company;

import java.util.*;

public class M_1_12_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = String.valueOf(n);
        String result = "NO";
        a:
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result = "YES";
                    break a;
                }
            }
        }
        System.out.println(result);
    }
}
