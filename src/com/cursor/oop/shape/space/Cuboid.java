package com.cursor.oop.shape.space;

import com.cursor.oop.Vertex3D;
import com.cursor.oop.shape.SpaceShape;

public class Cuboid extends SpaceShape {
    private Vertex3D vertex3D;
    private double length;
    private double height;
    private double depth;

    public Cuboid(Vertex3D vertex3D, double length, double height, double depth) {
        super(vertex3D);
        this.vertex3D = vertex3D;
        this.length = length;
        this.depth = depth;
        this.height = height;
        if ((!(depth > 0) || !(height > 0) || !((length) > 0))) throw new AssertionError();
    }

    @Override
    public double getArea() {
        return 2 * length * height + 2 * depth * height + 2 * length * depth;
    }

    @Override
    public double getVolume() {
        return length * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                " length=" + length +
                ", height=" + height +
                ", depth=" + depth +
                ", vertex's coordinate: " + vertex3D.printCoordinate() +
                ", area=" + formatter.format(getArea()) +
                ", volume=" + formatter.format(getVolume()) +
                '}';
    }
}