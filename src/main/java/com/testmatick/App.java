package com.testmatick;

import java.util.List;

import com.testmatick.generator.AbstractShapeFactory;
import com.testmatick.generator.RandomShapeFactory;
import com.testmatick.generator.ShapesGenerator;
import com.testmatick.shapes.Shape;

public class App {
    public static void main(String[] args) {
        AbstractShapeFactory shapeFactory = new RandomShapeFactory(100.0);
        List<Shape> randomShapes = ShapesGenerator.generateRandomShapes(shapeFactory, 100);
        for (Shape shape : randomShapes) {
            System.out.println(shape);
        }
    }
}
