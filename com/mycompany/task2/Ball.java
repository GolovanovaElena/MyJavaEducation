package com.mycompany.task2;

public class Ball {

    private float x = 0;
    private float y = 0;
    private int radius = 0;
    private float xDelta = 0;
    private float yDelta = 0;

    public Ball (float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float) (speed * Math.cos(direction * Math.PI / 180));
        yDelta = (float) (-1 * speed * Math.sin(direction * Math.PI / 180));
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return this.xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return this.yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x = x + this.xDelta;
        this.y = y + this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = - this.xDelta;
    }

    public void reflectVertical() {
        this.yDelta = - this.yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + this.getX() + "," + this.getY() + "), " +
                "speed = (" + this.getXDelta() + "," + this.getYDelta() + ")]";
    }

}
