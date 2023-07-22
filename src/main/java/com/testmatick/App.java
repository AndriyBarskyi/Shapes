package com.testmatick;

import java.util.List;

import com.testmatick.generator.ShapesGenerator;
import com.testmatick.shapes.Shape;

public class App {
    public static void main(String[] args) {
        List<Shape> randomShapes = ShapesGenerator.generateRandomShapes();
        for (Shape shape : randomShapes) {
            System.out.println(shape);
        }
    }
}
