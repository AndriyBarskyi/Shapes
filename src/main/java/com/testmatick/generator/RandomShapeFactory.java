package com.testmatick.generator;

import java.util.Random;

import com.testmatick.shapes.Circle;
import com.testmatick.shapes.Color;
import com.testmatick.shapes.RightTriangle;
import com.testmatick.shapes.Square;
import com.testmatick.shapes.Trapezoid;

public class RandomShapeFactory implements AbstractShapeFactory {
    private static final Double RANDOM_MAX_LEN = 100.0;
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    @Override
    public Circle getCircle() {
        return new Circle(colors[random.nextInt(colors.length)],
            random.nextDouble() * RANDOM_MAX_LEN);
    }

    @Override
    public Square getSquare() {
        return new Square(colors[random.nextInt(colors.length)],
            random.nextDouble() * RANDOM_MAX_LEN);
    }

    @Override
    public Trapezoid getTrapezoid() {
        return new Trapezoid(colors[random.nextInt(colors.length)],
            random.nextDouble() * RANDOM_MAX_LEN,
            random.nextDouble() * RANDOM_MAX_LEN,
            random.nextDouble() * RANDOM_MAX_LEN);
    }

    @Override
    public RightTriangle getRightTriangle() {
        return new RightTriangle(colors[random.nextInt(colors.length)],
            random.nextDouble() * RANDOM_MAX_LEN,
            random.nextDouble() * RANDOM_MAX_LEN);
    }
}
