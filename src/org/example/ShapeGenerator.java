package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class ShapeGenerator {
    public static void main(String[] args) {
        List<ShapeGenerator> shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0 -> shapes.add(new Sphere(1 + random.nextDouble() * 9));
                case 1 -> shapes.add(new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15));
                case 2 -> shapes.add(new Cube(1 + random.nextDouble() * 9));
            }
        }

        for (ShapeGenerator shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n%n", shape.volume());
        }
    }

    public abstract double surfaceArea();

    public abstract double volume();
}