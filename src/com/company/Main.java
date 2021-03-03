package com.company;


public class Main {

    public static void main(String[] args){
        Integer [] iArr = {1,2,3,4,5};
        Double [] dArr = {1.0, 2.0, 3.0, 4.0, 5.0};
        String [] sArr = {"a", "b", "c", "d", "e"};
        printArr(iArr);
        printArr(dArr);
        printArr(sArr);
        System.out.println(max("abc", "def"));

    }
    static public <T> void printArr(T [] iArr){
        for(int i = 0; i < iArr.length; i++){
            System.out.print(iArr[i] + " ");
        }
        System.out.println();
    }
    static public <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y)>0 ? x : y;
    }
}




