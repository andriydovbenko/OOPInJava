package com.cursor.oop.shape.plane;

import com.cursor.oop.vertex.Vertex2D;
import com.cursor.oop.shape.PlaneShape;

public class Rectangle extends PlaneShape {
    private Vertex2D vertex2D;
    private double width;
    private double height;
    private int indexOfVertex = 0;

    public Rectangle(double width, double height) {
        this.vertex2D = super.getVertices2D().get(indexOfVertex);
        if (width <= 0 || height <= 0) {
            System.out.println("Incorrect size of the figure\nwidth=" + width + "\nheight=" + height);
            throw new AssertionError();
        } else {
            this.width = width;
            this.height = height;
        }
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