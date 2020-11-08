package ru.mirea.lab3_1;
import java.lang.Math;

public class Square extends Rectangle{
   protected double side;

    public Square(){
        this.filled = false;
        this.color = "white";
        side = 1;
    }
    public Square(double side){
        this.filled = false;
        this.color = "white";
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return side*4;
    }
    @Override
    public String toString(){
        return "Shape: Square, side: "+this.side+", color:"+this.color+", filled:"+this.filled+", area: "+this.getArea()+", perimeter: "+this.getPerimeter();
    }
}
