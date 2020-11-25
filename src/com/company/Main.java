package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 5);
        Fraction f2 = new Fraction(1, 3);
        f1.add(f2);
        System.out.println(f1.numerator + " " + f1.denominator);
        Dog d = new Dog();

    }
}
class Fraction {
    int numerator;// Числитель
    int denominator = 1;// Знаменатель

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void add(Fraction f){
        this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        this.denominator = this.denominator * f.denominator;
    }
}
abstract class Animal{
    public abstract void voice();
}
class Dog extends Animal{

    @Override
    public void voice() {

    }
}
class Cat extends Animal implements Runnable{

    @Override
    public void voice() {

    }

    @Override
    public void run() {

    }
}

interface Runnable{
    public void run();
}