package ru.mirea.lab3_1;

public class Test {

    public static void main(String[] args) {

        Circle circle = new Circle(6);
        System.out.println(circle);
        circle.setColor("yellow");
        circle.setFilled(true);
        System.out.println("\n" + circle);

        Rectangle rect1 = new Rectangle(2, 5, "purple", false);
        System.out.println("\n" + rect1);

        Square square = new Square(4, "blue", true);
        System.out.println("\n" + square);

        Rectangle rect2 = new Square(6, "green", false);
        System.out.println("\n" + rect2);

        Shape shapeCircle = new Circle(2, "black", false);
        Shape shapeRectangle = new Rectangle(1, 1, "red", true);
        Shape shapeSquare = new Square(5, "pink", true);

        System.out.println("\n" + shapeCircle);
        System.out.println("\n" + shapeRectangle);
        System.out.println("\n" + shapeSquare);

    }
}
