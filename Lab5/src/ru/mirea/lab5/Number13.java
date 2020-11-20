package ru.mirea.lab5;

/*Дана последовательность натуральных чисел (одно число в строке),
  завершающаяся числом 0. Выведите первое, третье, пятое и т.д. из введенных
  чисел. Завершающий ноль выводить не надо.*/

import java.util.Scanner;

public class Number13 {
    public static int recursion()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean s = true;
        if (n==0){
            return 0;
        }
        System.out.println(n);

        int m = in.nextInt();
        if (m==0){
            return 0;
        }
        return recursion();
    }

    public static void main(String[] args){
        Number13 num13 = new Number13();
        Number13.recursion();
    }
}
