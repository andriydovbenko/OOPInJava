package com.cursor.oop;

import com.cursor.oop.shape.Shape;
import com.cursor.oop.shape.plane.Circle;
import com.cursor.oop.shape.plane.Rectangle;
import com.cursor.oop.shape.plane.Triangle;
import com.cursor.oop.shape.space.Cuboid;
import com.cursor.oop.shape.space.Sphere;
import com.cursor.oop.shape.space.SquarePyramid;

public class Main {

    public static void main(String[] args) {
        Vertex2D vertex2DFirst = new Vertex2D(10, 10);
        Vertex2D vertex2DSecond = new Vertex2D(0, 0);
        Vertex2D vertex2DThird = new Vertex2D(20, 20);
        Vertex3D vertex3D = new Vertex3D(10, 10, 15);

        Shape[] arrayOfShape = {
                new Rectangle(vertex2DFirst, 10,15),
                new Triangle(vertex2DFirst, vertex2DSecond, vertex2DThird),
                new Circle(vertex2DFirst, 20),
                new Cuboid(vertex3D,10,10,10),
                new Sphere(vertex3D,10),
                new SquarePyramid(vertex3D,10,20)};
        for (Shape shape : arrayOfShape) {
            System.out.println(shape.toString());
        }
    }
}