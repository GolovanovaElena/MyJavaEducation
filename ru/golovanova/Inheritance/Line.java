package ru.golovanova.Inheritance;

public class Line extends Shape implements Cloneable{
    protected Point to;

    public Line(Point from, Point to) {
        this.newPoint = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((newPoint.getX() + to.getX() )/ 2, (newPoint.getY() + to.getY()) / 2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Line(new Point(newPoint.getX(), newPoint.getY()), new Point(to.getX(), to.getY()));
    }
}
