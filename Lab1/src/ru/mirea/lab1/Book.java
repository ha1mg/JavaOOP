package ru.mirea.lab1;
import java.lang.*;

public class Book {
    private String name;
    private int year_of_writing;

    public Book() {
        name = "The master and Margarita";
        year_of_writing = 1967;
    }

    public Book(String name) {
        this.name = name;
        year_of_writing = 0;
    }

    public Book(String name, int year_of_writing) {
        this(name);
        this.year_of_writing = year_of_writing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year_of_writing) {
        this.year_of_writing = year_of_writing;
    }

    public String getName() {
        return name;
    }

    public int getYaer() {
        return year_of_writing;
    }

    public String toString() {
        return name + ", year of writing is " + year_of_writing;
    }

    public void yearsSinceWriting() {
        System.out.println(2020 - year_of_writing + " years have passed since the " + name + " was written");
    }
}


