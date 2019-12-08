package com.cursor.oop.shape.plane;

import com.cursor.oop.Vertex2D;
import com.cursor.oop.shape.PlaneShape;

public class Circle extends PlaneShape {
    private double radius;
    private Vertex2D vertex2D;

    public Circle(Vertex2D vertex2D, double radius) {
        super(vertex2D);
        this.vertex2D = vertex2D;
        this.radius = radius;
        if (!(radius > 0)) throw new AssertionError();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", vertex's coordinate: " + vertex2D.printCoordinate() +
                ", area=" + formatter.format(getArea()) +
                ", perimeter=" + formatter.format(getPerimeter()) +
                '}';
    }
}