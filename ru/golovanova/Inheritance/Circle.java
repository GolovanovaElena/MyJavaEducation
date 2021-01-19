package ru.golovanova.Inheritance;

public class Circle extends Shape implements Cloneable {
    protected double radius = 0;

    public Circle(double radius, Point newPoint) {
        this.radius = radius;
        this.newPoint = newPoint;
    }

    @Override
    public Point getCenter() {
        return this.newPoint;
    }

    public double getRadius() {
        return this.radius;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new Circle(this.getRadius(), new Point(newPoint.getX(), newPoint.getY()));
    }

    public static void main(String[] args) {
        Point example = new Point( 1.0, 1.0);
        Circle exampleCircle = new Circle(5,example);
        System.out.println(exampleCircle.getCenter());
        System.out.println(exampleCircle.getRadius());
    }
}
