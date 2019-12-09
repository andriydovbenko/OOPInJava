package com.cursor.oop.shape.space;

import com.cursor.oop.Vertex3D;
import com.cursor.oop.shape.SpaceShape;

public class SquarePyramid extends SpaceShape {
    private Vertex3D baseCenter;
    private double baseWidth;
    private double height;
    private int indexOfVertex = 0;

    public SquarePyramid(double baseWidth, double height) {
        this.baseCenter = super.getVertices3D().get(indexOfVertex);
        this.baseWidth = baseWidth;
        this.height = height;
        if (!(baseWidth > 0) || !(height > 0)) throw new AssertionError();
    }

    @Override
    public double getArea() {
        return Math.pow(baseWidth, 2) + baseWidth * Math.sqrt(Math.pow(baseWidth, 2) +
                +4 * Math.pow(height, 2));
    }

    @Override
    public double getVolume() {
        return (double) (1 / 3) * Math.pow(baseWidth, 2) * height;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                " base width=" + baseWidth +
                ", base center: " + baseCenter.printCoordinate() +
                ", area=" + formatter.format(getArea()) +
                ", volume=" + formatter.format(getVolume()) +
                '}';
    }
}