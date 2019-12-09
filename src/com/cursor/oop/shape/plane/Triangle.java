package com.cursor.oop.shape.plane;

import com.cursor.oop.vertex.Vertex2D;
import com.cursor.oop.shape.PlaneShape;

public class Triangle extends PlaneShape {
    private Vertex2D vertex2DFirst;
    private Vertex2D vertex2DSecond;
    private Vertex2D vertex2DThird;
    private int indexOfVertex1 = 0;
    private int indexOfVertex2 = 1;
    private int indexOfVertex3 = 2;

    public Triangle() {
        this.vertex2DFirst = super.getVertices2D().get(indexOfVertex1);
        this.vertex2DSecond = super.getVertices2D().get(indexOfVertex2);
        this.vertex2DThird = super.getVertices2D().get(indexOfVertex3);
    }

    private double countTheSegment(Vertex2D first, Vertex2D second) {
        return Math.sqrt(Math.pow(first.getX() - second.getX(), 2) + Math.pow(first.getY() - second.getY(), 2));
    }

    @Override
    public double getArea() {
        return Math.abs((vertex2DSecond.getX() - vertex2DFirst.getX()) * (vertex2DThird.getY() - vertex2DFirst.getY() -
                (vertex2DThird.getX() - vertex2DFirst.getX()) * (vertex2DSecond.getY() - vertex2DFirst.getY()))) / 2;
    }

    @Override
    public double getPerimeter() {
        return (countTheSegment(vertex2DFirst, vertex2DSecond) + countTheSegment(vertex2DSecond, vertex2DThird)
                + countTheSegment(vertex2DFirst, vertex2DFirst));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " First vertex: " + vertex2DFirst.printCoordinate() +
                ", Second vertex: " + vertex2DFirst.printCoordinate() +
                ", Third vertex: " + vertex2DFirst.printCoordinate() +
                ", area=" + formatter.format(getArea()) +
                ", perimeter=" + formatter.format(getPerimeter()) +
                '}';
    }
}