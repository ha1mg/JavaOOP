package ru.mirea.lab2;
import java.lang.*;

public class Ball {
    private double x;
    private double y;

     public Ball(double x, double y){
         this.x=x;
         this.y=y;
     }
     public Ball(){
        x=0.0;
        y=0.0;
     }
     public double getX(){
         return x;
     }
     void setX(double x){
         this.x=x;
     }
    public double getY(){
        return y;
    }
    void setY(double y){
        this.y=y;
    }
    void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    void move(double xDisp, double yDisp){
         x+=xDisp;
         y+=yDisp;
    }
    public String toString(){
         return  "Ball @ ("+x+", "+y+").";
    }


}
