package com.cursor.oop.shape;

import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.VolumeMeasurable;
import com.cursor.oop.vertex.Vertex;
import com.cursor.oop.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    private List<Vertex3D> vertices3D = new ArrayList<>();

    protected SpaceShape() {
        createListOf3DVertex();
    }

    private void createListOf3DVertex() {
        List<Vertex> vertex = super.getVerticesOfShape();
        for (Vertex vert : vertex) {
            if (vert instanceof Vertex3D) {
                vertices3D.add((Vertex3D) vert);
            }
        }
    }

    public List<Vertex3D> getVertices3D() {
        return vertices3D;
    }
}