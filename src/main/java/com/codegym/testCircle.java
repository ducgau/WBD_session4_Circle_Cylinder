package com.codegym;

public class testCircle extends Circle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

         circle = new Circle(1.5,"green");
        System.out.println(circle);
    }
}
