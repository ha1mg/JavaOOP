package ru.mirea.lab5;


/*Дано натуральное число N. Выведите все его цифры по одной, в обычном
  порядке, разделяя их пробелами или новыми строками.*/
public class Number14 {

    public static int recursion(int N)
    {

        if (N<0){
            System.out.println("Введите натуральное число!");
            return 0;
        }
        if(N<10 && N>0) {
            System.out.print(N + " ");
            return 0;
        }
        recursion(N/10);
        System.out.print((N % 10)+" ");
        return 0;
    }

    public static void main(String[] args){
        Number14 num12 = new Number14();
        Number14.recursion(41678654);
    }
}
