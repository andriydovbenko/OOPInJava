package com.cursor.oop.shape.plane;

import com.cursor.oop.Vertex2D;
import com.cursor.oop.shape.PlaneShape;

public class Rectangle extends PlaneShape {
    private Vertex2D vertex2D;
    private double width;
    private double height;

    public Rectangle(Vertex2D vertex2D, double width, double height) {
        super(vertex2D);
        this.width = width;
        this.height = height;
        this.vertex2D = vertex2D;
        if ((!(width > 0) || !(height > 0))) throw new AssertionError();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " width=" + width +
                ", height=" + height +
                ", vertex's coordinate: " + vertex2D.printCoordinate() +
                ", area=" + formatter.format(getArea()) +
                ", perimeter=" + formatter.format(getPerimeter()) +
                '}';
    }
}