package ru.mirea.lab1;
import java.lang.*;

public class Ball {
    private String color;
    private double diameter;

    public Ball(){
        color="Green";
        diameter=12.5;
    }
    public Ball(String color){
        this.color=color;
        diameter=0;
    }
    public Ball(String color, double diameter){
        this(color);
        this.diameter=diameter;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setDiameter(int diameter){
        this.diameter=diameter;
    }
    public String getColor(){
        return color;
    }
    public double getDiameter(){
        return diameter;
    }
    public String toString(){
        return color + "ball, diameter is " + diameter;
    }
    public double getVolume(){
        return (4/3)*Math.PI*Math.pow((diameter/2),3);
    }
}
