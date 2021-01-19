package ru.golovanova.Inheritance;

public abstract class Shape {
    protected Point newPoint;
    public void moveBy(double dx, double dy) {
        newPoint.setX(newPoint.x + dx);
        newPoint.setY(newPoint.y + dy);
    }
    public abstract Point getCenter();
}
