package ru.mirea.lab3_1;
import java.lang.Math;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "white";
        radius = 1;
    }
    public Circle(double radius) {
        this.filled = false;
        this.color = "white";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this(radius);
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return "Shape: Circle, radius: " + this.radius +", color: "+this.color+", filled:"+this.filled+", area: " + this.getArea() + ", circumference: " + this.getPerimeter();
    }

}
