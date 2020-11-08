package ru.mirea.lab3_2;

public class MovableCircle implements Movable{
    private  int radius;
    private MovablePoint center;

    public  MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius=radius;
        this.center=new MovablePoint(x, y,xSpeed, ySpeed);
    }
    public String toString(){
        return "Circle\n"+"center: "+center+"\nradius: "+radius+"\n";
    }

    @Override
    public void moveUp(){center.moveUp();}
    @Override
    public void moveDown(){center.moveDown();}
    @Override
    public void moveLeft(){center.moveLeft();}
    @Override
    public void moveRight(){center.moveRight();}
}
