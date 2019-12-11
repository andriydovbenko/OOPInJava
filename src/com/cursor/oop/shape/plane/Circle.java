package com.cursor.oop.shape.plane;

import com.cursor.oop.vertex.Vertex2D;
import com.cursor.oop.shape.PlaneShape;

public class Circle extends PlaneShape {
    private double radius;
    private Vertex2D vertex2D;
    private int indexOfVertex = 1;

    public Circle(double radius) {
        this.vertex2D = super.getVertices2D().get(indexOfVertex);
        if (radius <= 0) {
            System.out.println("Incorrect size of the figure\nradius=" + radius);
            throw new AssertionError();
        } else {
            this.radius = radius;
        }
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