package ru.mirea.lab5;
import java.util.Scanner;

/*Дана последовательность натуральных чисел (одно число в строке),
  завершающаяся числом 0. Выведите все нечетные числа из этой
  последовательности, сохраняя их порядок.*/

public class Number12 {
    public static int recursion()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==0){
            return 0;
        }
        if ((n % 2) != 0) {
            System.out.println(n);
        }
        return recursion();
    }

    public static void main(String[] args){
        Number12 num12 = new Number12();
        Number12.recursion();
    }
}

