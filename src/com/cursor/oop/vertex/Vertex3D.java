package com.cursor.oop.vertex;

public class Vertex3D extends Vertex {
    private double x;
    private double y;
    private double z;

    public Vertex3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String printCoordinate() {
        return "(x=" + x +
                ", y=" + y +
                ", z=" + z +
                ')';
    }
}