package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class M_4_10_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> t = new TreeMap<>();
        while (in.hasNext()) {
            String[] w = in.nextLine().split(" ");
            Integer b = Integer.valueOf(w[2]);
            if (!t.containsKey(w[0])) {
                t.put(w[0], new TreeMap<>());
            }
            TreeMap<String, Integer> q = t.get(w[0]);
            if (!q.containsKey(w[1])) {
                q.put(w[1], b);
            } else {
                q.put(w[1], q.get(w[1]) + b);
            }
        }
        for (Map.Entry<String, TreeMap<String, Integer>> entry : t.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, Integer> i : entry.getValue().entrySet()) {
                System.out.println(i.getKey() + " " + i.getValue());
            }
        }
    }
}
