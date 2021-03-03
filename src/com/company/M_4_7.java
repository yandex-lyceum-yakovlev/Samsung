package com.company;

import java.util.Scanner;

public class M_4_7 {
    static class Tree{
        int node;
        Tree left = null;
        Tree right = null;

        Tree(int node){
            this.node = node;
        }

        public int height(){
            if (left==null && right==null) return 1;
            if (left==null) return right.height() + 1;
            if (right==null) return left.height() + 1;
            return Math.max(left.height(), right.height()) + 1;
        }

        public boolean ballance(){
            if (left==null && right==null) return true;
            if (left==null) return right.height()==1;
            if (right==null) return left.height()==1;
            return Math.abs(left.height() - right.height())<=1 && left.ballance() && right.ballance();
        }

        public void add(int node){
            if (node<this.node){
                if (left==null){
                    left = new Tree(node);
                }
                else{
                    left.add(node);
                }
            }
            if (node>this.node){
                if (right==null){
                    right = new Tree(node);
                }
                else{
                    right.add(node);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree t = new Tree(n);
        while (n !=0){
            t.add(n);
            n = in.nextInt();
        }
        if (t.ballance())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
