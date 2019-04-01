package com.codegym;

public class Cylinder extends Circle {
    private double height = 3;
    public Cylinder(){
    }
    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height*getArea();
    }

    @Override
    public String toString() {
        return "a cylinder with a radius= " + getRadius() + ",color: " + getColor() + ", height= " + getHeight() + " and volume= " + getVolume();
    }
}
