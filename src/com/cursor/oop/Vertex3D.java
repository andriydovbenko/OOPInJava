package com.cursor.oop;

import com.cursor.oop.shape.Vertex;

public class Vertex3D extends Vertex {
    private double x;
    private double y;
    private double z;

    public Vertex3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String printCoordinate() {
        return "(x=" + x +
                ", y=" + y +
                ", z=" + z +
                ')';
    }
}