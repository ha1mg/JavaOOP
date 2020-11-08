package ru.mirea.lab3_2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2,5, 1, 6);
        System.out.println(point);
        point.moveDown();
        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(8, 0, 10, 20, 5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(0,0, 5,8,6,8);
        System.out.println(rectangle);
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
