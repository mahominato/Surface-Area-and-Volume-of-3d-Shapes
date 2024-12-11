package org.example;

public class Cube extends ShapeGenerator {
    private final double sideLength;

    public Cube(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be greater than zero.");
        }
        this.sideLength = sideLength;
    }

    public double surfaceArea() {
        return 6 * sideLength * sideLength;
    }

    @Override
    public double volume() {
        return sideLength * sideLength * sideLength;

    }
    @Override
    public String toString() {
        return String.format("Cube (Side Length: %.2f)", sideLength);
    }
}