package com.cursor.oop.shape.space;

import com.cursor.oop.vertex.Vertex3D;
import com.cursor.oop.shape.SpaceShape;

public class Sphere extends SpaceShape {
    private Vertex3D vertex3D;
    private double radius;
    private int indexOfVertex = 0;

    public Sphere(double radius) {
        this.vertex3D = super.getVertices3D().get(indexOfVertex);
        if (radius <= 0) {
            System.out.println("Incorrect size of the figure\nradius=" + radius);
            throw new AssertionError();
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return (double) 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                " radius=" + radius +
                ", vertex's coordinate: " + vertex3D.printCoordinate() +
                ", area=" + formatter.format(getArea()) +
                ", volume=" + formatter.format(getVolume()) +
                '}';
    }
}