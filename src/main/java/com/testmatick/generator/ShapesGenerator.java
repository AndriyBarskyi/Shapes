package com.testmatick.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.testmatick.shapes.Shape;

public class ShapesGenerator {
    private static final Shapes[] shapeTypes = Shapes.values();

    private static final Random random = new Random();
    private static final Integer RANDOM_SHAPES_AMOUNT = random.nextInt(100);
    private static final RandomShapeFactory randomShapeFactory =
        new RandomShapeFactory();

    public static List<Shape> generateRandomShapes() {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < RANDOM_SHAPES_AMOUNT + 1; ++i) {
            Shapes randomType = shapeTypes[random.nextInt(shapeTypes.length)];
            Shape randomShape;
            switch (randomType) {
            case SQUARE:
                randomShape = randomShapeFactory.getSquare();
                break;
            case RIGHT_TRIANGLE:
                randomShape = randomShapeFactory.getRightTriangle();
                break;
            case CIRCLE:
                randomShape = randomShapeFactory.getCircle();
                break;
            case TRAPEZOID:
                randomShape = randomShapeFactory.getTrapezoid();
                break;
            default:
                throw new IllegalArgumentException(
                    "Невідомий тип фігури: " + randomType);
            }
            shapes.add(randomShape);
        }
        return shapes;
    }
}
