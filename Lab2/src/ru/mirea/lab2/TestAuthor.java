package ru.mirea.lab2;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("S.King", "blabla@gmail.com", 'm');
        a.setEmail("abc@gmail.com");
        System.out.println(a);
    }
}
