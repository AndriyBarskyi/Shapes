package com.testmatick.generator;

import java.util.Random;

import com.testmatick.shapes.Circle;
import com.testmatick.shapes.Color;
import com.testmatick.shapes.RightTriangle;
import com.testmatick.shapes.Square;
import com.testmatick.shapes.Trapezoid;

public class RandomShapeFactory implements AbstractShapeFactory {
    private Random random = new Random(10000);
    private Color[] colors = Color.values();

    @Override
    public Circle getCircle() {
        return new Circle(colors[new Random(colors.length).nextInt()],
            random.nextDouble());
    }

    @Override
    public Square getSquare() {
        return new Square(colors[new Random(colors.length).nextInt()],
            random.nextDouble());
    }

    @Override
    public Trapezoid getTrapezoid() {
        return new Trapezoid(colors[new Random(colors.length).nextInt()],
            random.nextDouble(), random.nextDouble(), random.nextDouble());
    }

    @Override
    public RightTriangle getRightTriangle() {
        return new RightTriangle(colors[new Random(colors.length).nextInt()],
            random.nextDouble(), random.nextDouble());
    }
}
