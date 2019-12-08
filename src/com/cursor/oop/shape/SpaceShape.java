package com.cursor.oop.shape;

import com.cursor.oop.Vertex3D;
import com.cursor.oop.interfaces.AreaMeasurable;
import com.cursor.oop.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D vertex3D) {
        this.setVerticesOfShape(vertex3D);
    }
}