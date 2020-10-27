package ru.mirea.lab2;
import java.lang.*;

public class TestBall {
    public static void main(String[] args){
    Ball b1 = new Ball();
    Ball b2 = new Ball(1.25, 4.0);
    b2.setX(3.1);
    b2.setY((6.6));
    b1.setXY(2.5,1.0);
    b2.move(10,15);
    System.out.println(b1);
    System.out.println(b2);
    }
}
