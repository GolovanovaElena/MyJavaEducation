package com.mycompany.task2;

public class Container {
    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;

    public Container ( int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = this.x1 + width;
        this.y2 = this.y1 + height;
    }

    public int getX() {
        return this.x1;
    }

    public int getY() {
        return this.y1;
    }

    public int getWidth() {
        return this.x2 - this.x1;
    }

    public int getHeight() {
        return this.y2 - this.y1;
    }

    public boolean collides(Ball ball) {
        float right = ball.getX() + ball.getRadius();
        float left = ball.getX() - ball.getRadius();
        float up = ball.getY() - ball.getRadius();
        float down = ball.getY() + ball.getRadius();
        if ((right < this.getWidth()) && (left > this.x1)
                && (up > y1) && (down < this.getHeight()))
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Container[{" + x1 +"," + y1 + "), (" +x2 + "," +y2 + ")]";
    }
}
