package com.cursor.oop.shape;

import com.cursor.oop.Vertex2D;
import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.PerimeterMeasurable;

import java.util.ArrayList;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    private ArrayList<Vertex2D> vertices2D = new ArrayList<>();

    protected PlaneShape() {
        createListOf2DVertex();
    }

    private void createListOf2DVertex() {
        ArrayList<Vertex> vertex = new ArrayList<>(super.getVerticesOfShape());
        for (Vertex vert : vertex) {
            if (vert instanceof Vertex2D) {
                vertices2D.add((Vertex2D) vert);
            }
        }
    }

    public ArrayList<Vertex2D> getVertices2D() {
        return vertices2D;
    }
}