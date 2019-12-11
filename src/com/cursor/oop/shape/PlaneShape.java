package com.cursor.oop.shape;

import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.PerimeterMeasurable;
import com.cursor.oop.vertex.Vertex;
import com.cursor.oop.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    private List<Vertex2D> vertices2D = new ArrayList<>();

    protected PlaneShape() {
        createListOf2DVertex();
    }

    private void createListOf2DVertex() {
        List<Vertex> vertex = super.getVerticesOfShape();
        for (Vertex vert : vertex) {
            if (vert instanceof Vertex2D) {
                vertices2D.add((Vertex2D) vert);
            }
        }
    }

    public List<Vertex2D> getVertices2D() {
        return vertices2D;
    }
}