package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class M_4_8_1  {

    static class Student implements Comparable<Student>{
        int n;
        int v;

        Student(int n, int v){
            this.n = n;
            this.v = v;
        }


        @Override
        public int compareTo(Student o) {
            if (v-o.v == 0)
                return n - o.n;
            else
                return o.v - v;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student(in.nextInt(), in.nextInt());
        }
        Arrays.sort(a);
        for (Student i:a) {
            System.out.println(i.n + " " + i.v);
        }
    }
}