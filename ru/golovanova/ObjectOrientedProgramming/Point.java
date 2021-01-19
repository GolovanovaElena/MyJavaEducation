package ru.golovanova.ObjectOrientedProgramming;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y){
        double xNew = this.x + x;
        double yNew = this.y + y;
        Point newPoint = new Point(xNew, yNew);
        return newPoint;
    }

    public Point scale (double variable) {
        double xNew = this.x * variable;
        double yNew = this.y * variable;
        Point newPoint = new Point(xNew, yNew);
        return newPoint;
    }
}
