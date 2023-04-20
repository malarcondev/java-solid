package org.malarcondev.solid;

public class Cube implements Shape, ThreeDimensionalShape{

    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volumen() {
        return 100;
    }
}
