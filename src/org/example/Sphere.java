package org.example;

public class Sphere extends ShapeGenerator {
    private final double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Sphere (Radius: %.2f)", radius);
    }
}