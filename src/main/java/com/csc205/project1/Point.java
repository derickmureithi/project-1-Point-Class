package com.csc205.project1;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        x += n;
    }

    public void shiftY(double n) {
        y += n;
    }

    public double distance(Point p2) {
        double xDiff = x - p2.x;
        double yDiff = y - p2.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public void rotate(double angle) {
        double xPrime = x * Math.cos(angle) - y * Math.sin(angle);
        double yPrime = x * Math.sin(angle) + y * Math.cos(angle);
        x = xPrime;
        y = yPrime;
    }
}
