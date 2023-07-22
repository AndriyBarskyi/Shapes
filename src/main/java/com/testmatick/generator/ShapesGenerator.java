package com.testmatick.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.testmatick.shapes.Shape;


public class ShapesGenerator {
    private static final Shapes[] SHAPE_TYPES = Shapes.values();
    private static final int DEFAULT_MAX_SHAPES_AMOUNT = 50;
    private static final Random RANDOM = new Random();

    private ShapesGenerator() {
    }

    /**
     * Generates a list of random shapes using the provided shape factory.
     *
     * @param shapeFactory   The AbstractShapeFactory to create shapes.
     * @param maxShapesAmount The maximum number of shapes to generate.
     *                        If null or negative, a default value of 50 will be used.
     * @return List of randomly generated shapes.
     * @throws IllegalArgumentException if an unknown shape type is encountered.
     */
    public static List<Shape> generateRandomShapes(AbstractShapeFactory shapeFactory, Integer maxShapesAmount) {
        int shapesAmount = (maxShapesAmount != null && maxShapesAmount > 0) ? maxShapesAmount : DEFAULT_MAX_SHAPES_AMOUNT;
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < shapesAmount; ++i) {
            int randomIndex = RANDOM.nextInt(SHAPE_TYPES.length);
            Shapes randomShapeType = SHAPE_TYPES[randomIndex];
            Shape randomShape;

            switch (randomShapeType) {
            case CIRCLE:
                randomShape = shapeFactory.createCircle();
                break;
            case TRAPEZOID:
                randomShape = shapeFactory.createTrapezoid();
                break;
            case SQUARE:
                randomShape = shapeFactory.createSquare();
                break;
            case RIGHT_TRIANGLE:
                randomShape = shapeFactory.createRightTriangle();
                break;
            default:
                throw new IllegalArgumentException("Невідомий тип фігури: " + randomShapeType);
            }
            shapes.add(randomShape);
        }
        return shapes;
    }
}
