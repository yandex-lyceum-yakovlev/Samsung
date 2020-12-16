package com.company;

import java.util.Locale;

public class Vector2D {

    public double vX;
    public double vY;
    public Vector2D(){
        vX = 1;
        vY = 1;
    }
    public Vector2D(double X, double Y){
        vX = X;
        vY = Y;
    }

    public Vector2D(Vector2D v){
        vX = v.vX;
        vY = v.vY;
    }

    public void print(){
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", vX, vY));
    }

    public static void main(String[] args) {
        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();
    }
}

