package org.malarcondev.solid;

public class Circle implements Shape{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(getRadius(), 2);
    }
}
