package ru.golovanova.task1;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint () {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arrayXY = new int [2];
        arrayXY[0] = this.x;
        arrayXY[1] = this.y;
        return arrayXY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "'(" + x +
                ", " + y +
                ")'";
    }

    public double distance(int x, int y) {

        return Math.sqrt(Math.pow(this.getX()-x,2) +
                Math.pow(this.getY()-y,2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(this.getX()- another.getX(),2)
                + Math.pow(this.getY()-another.getY(),2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(getX(),2)
                + Math.pow(getY(),2));
    }
}
