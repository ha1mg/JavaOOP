package ru.mirea.lab3_1;
import java.lang.Math;

public class Rectangle extends  Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "white";
        width = 1;
        length=1;
    };
    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "white";
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this(width,length);
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){
        return  width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return  length;
    }
    public void setLength(double length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return "Shape: Rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color+", filled:"+this.filled+", area: "+this.getArea()+", perimeter: "+this.getPerimeter();
    }

}
