package com.cursor.oop.execution;

import com.cursor.oop.shape.Shape;
import com.cursor.oop.shape.plane.Circle;
import com.cursor.oop.shape.plane.Rectangle;
import com.cursor.oop.shape.plane.Triangle;
import com.cursor.oop.shape.space.Cuboid;
import com.cursor.oop.shape.space.Sphere;
import com.cursor.oop.shape.space.SquarePyramid;

public class ProjectOOP {

    public static void start() {
        Shape[] arrayOfShape = {
                new Rectangle(10, 15),
                new Triangle(),
                new Circle(20),
                new Cuboid(10, 10, 10),
                new Sphere(10),
                new SquarePyramid(10, 20)};
        for (Shape shape : arrayOfShape) {
            System.out.println(shape.toString());
        }
    }
}