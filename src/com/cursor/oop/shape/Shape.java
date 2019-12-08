package com.cursor.oop.shape;

import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Shape {
    private ArrayList<Vertex> verticesOfShape = new ArrayList<>();
    protected DecimalFormat formatter = new DecimalFormat("#0.00");

    public void setVerticesOfShape(Vertex vertex) {
        verticesOfShape.add(vertex);
    }
}