package ru.mirea.lab1;
import java.lang.*;

public class TestBook {
    public static void main(String[] args){
        Book d1=new Book("1984", 1948);
        Book d2 = new Book("Three comrades", 1936);
        Book d3 = new Book("Сlockwork orange");
        d3.setYear(1962);
        System.out.println(d2.getName());

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d1.yearsSinceWriting();
        d2.yearsSinceWriting();
        d3.yearsSinceWriting();
    }
}
