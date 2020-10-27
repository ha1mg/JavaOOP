package ru.mirea.lab1;
import java.lang.*;

public class TestBall {
    public static void main(String[] args){
        Ball d1=new Ball("Red", 10);
        Ball d2 = new Ball("Blue", 15.5);
        Ball d3 = new Ball("Pink");
        d3.setDiameter(12);
        System.out.println(d2.getColor());

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("The volume of the " + d1.getColor() + " ball is " + d1.getVolume());
        System.out.println("The volume of the " + d2.getColor() + " ball is " + d2.getVolume());
        System.out.println("The volume of the " + d3.getColor() + " ball is " + d3.getVolume());
    }
}