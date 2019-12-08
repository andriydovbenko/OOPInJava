package com.cursor.oop.shape.space;

import com.cursor.oop.Vertex3D;
import com.cursor.oop.shape.SpaceShape;

public class Sphere extends SpaceShape {
    private Vertex3D vertex3D;
    private double radius;

    public Sphere(Vertex3D vertex3D, double radius) {
        super(vertex3D);
        this.vertex3D = vertex3D;
        this.radius = radius;
        if (!(radius > 0)) throw new AssertionError();
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