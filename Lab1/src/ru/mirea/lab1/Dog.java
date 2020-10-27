package ru.mirea.lab1;
import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog(){
        name="Oscar";
        age=7;
    }
    public Dog(String name){
        this.name=name;
        age=0;
    }
    public Dog(String name, int age){
        this(name);
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return name + ", age " + age;
    }
    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age*7 + " years");
    }
}
