package com.example.danielstewart.steviesroofcalculator;

public class Triangle {
    private double b;
    private double c;
    private double d;

    public Triangle(double b, double c, double d){
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA(){
        if(c == -1){
            return b / Math.cos(Math.toRadians(d));
        } else {
            return Math.sqrt(b*b + c*c);
        }
    }

    public double getB(){
        return b;
    }

    public double getC(){
        if(c == -1){
            return Math.tan(Math.toRadians(d)) * b;
        } else {
            return c;
        }
    }

    public double getD(){
        if(d == -1){
            d = Math.toDegrees(Math.atan(c/b));
            return d;
        } else {
            return d;
        }
    }

    public double getE(){
        if(d == -1){
            getD();
        }
        return 90 - d;
    }



}
