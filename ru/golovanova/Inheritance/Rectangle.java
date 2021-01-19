package ru.golovanova.Inheritance;

public class Rectangle extends Shape implements Cloneable {
    protected double width = 0;
    protected double height = 0;

    public Rectangle(Point topLeft, double width, double height) {
        this.newPoint = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(newPoint.getX() + this.width / 2, newPoint.getY() + this.height / 2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Rectangle(new Point(newPoint.getX(), newPoint.getY()), this.width, this.height);
    }

}
