package com.cursor.oop.shape;

import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    protected PlaneShape(Vertex vertex) {
        super.setVerticesOfShape(vertex);
    }

    protected PlaneShape(Vertex vertex1, Vertex vertex2, Vertex vertex3) {
        super.setVerticesOfShape(vertex1);
        super.setVerticesOfShape(vertex2);
        super.setVerticesOfShape(vertex3);
    }
}