package com.cursor.oop.shape;

import com.cursor.oop.vertex.Vertex;
import com.cursor.oop.vertex.Vertex2D;
import com.cursor.oop.vertex.Vertex3D;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    private static List<Vertex> verticesOfShape = new ArrayList<>();

    static {
        Vertex2D vertex2DFirst = new Vertex2D(10, 10);
        Vertex2D vertex2DSecond = new Vertex2D(0, 0);
        Vertex2D vertex2DThird = new Vertex2D(20, 20);
        Vertex3D vertex3D = new Vertex3D(10, 10, 15);
        verticesOfShape.add(vertex2DFirst);
        verticesOfShape.add(vertex2DSecond);
        verticesOfShape.add(vertex2DThird);
        verticesOfShape.add(vertex3D);
    }

    protected DecimalFormat formatter = new DecimalFormat("#0.00");

    public List<Vertex> getVerticesOfShape() {
        return verticesOfShape;
    }
}