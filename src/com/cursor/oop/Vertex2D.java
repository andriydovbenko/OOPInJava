package com.cursor.oop;

import com.cursor.oop.shape.Vertex;

public class Vertex2D extends Vertex {
    private double x;
    private double y;

    Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String printCoordinate() {
        return "(x=" + x +
                ", y=" + y +
                ')';
    }
}