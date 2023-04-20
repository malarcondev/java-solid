package org.malarcondev.solid;

public class Square implements Shape{
    private final int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getLenght(), 2);
    }
}
