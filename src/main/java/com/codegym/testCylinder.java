package com.codegym;

public class testCylinder extends Cylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3,"red",5);
        System.out.println(cylinder);
    }
}
