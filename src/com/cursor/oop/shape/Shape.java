package com.cursor.oop.shape;

import com.cursor.oop.Vertex2D;
import com.cursor.oop.Vertex3D;

import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Shape {

    private static ArrayList<Vertex> verticesOfShape = new ArrayList<>();

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

    public ArrayList<Vertex> getVerticesOfShape() {
        return verticesOfShape;
    }
}