package com.cursor.oop.shape;

import com.cursor.oop.Vertex2D;
import com.cursor.oop.Vertex3D;
import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.VolumeMeasurable;

import java.util.ArrayList;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    private ArrayList<Vertex3D> vertices3D = new ArrayList<>();

    protected SpaceShape() {
        createListOf3DVertex();
    }

    private void createListOf3DVertex() {
        ArrayList<Vertex> vertex = new ArrayList<>(super.getVerticesOfShape());
        for (Vertex vert : vertex) {
            if (vert instanceof Vertex3D) {
                vertices3D.add((Vertex3D) vert);
            }
        }
    }

    public ArrayList<Vertex3D> getVertices3D() {
        return vertices3D;
    }
}