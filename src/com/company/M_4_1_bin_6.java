package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class M_4_1_bin_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        long last = in.nextLong();
        a.add(last);
        long floor = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            long next = in.nextLong();
            a.add(next);
            if (next - last < floor)
                floor = next - last;
            last = next;
        }
        long ceil = (a.get(n - 1) - a.get(0)) / (k - 1);
        while (ceil - floor > 1){
            long middle = (ceil+floor) / 2;
            if (f(a, middle, k)){
                floor = middle;
            }
            else{
                ceil = middle;
            }
        }
        if (f(a, ceil, k)){
            System.out.println(ceil);
        }
        else{
            System.out.println(floor);
        }


    }
    static boolean f(ArrayList<Long> a, long m, long k){
        int li = 0;
        int i = 0;
        long t = k - 1;
        while(li + i < a.size()){
            while(li + i < a.size() && a.get(li+i) - a.get(li) < m){
                i++;
            }
            if (li + i < a.size()){
                //System.out.println(a.get(li+i));
                t--;
                if (t <= 0) return true;
                li += i;
                i = 0;
            }
        }
        return false;
    }
}
