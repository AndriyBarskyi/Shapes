package com.testmatick.generator;

import com.testmatick.shapes.Circle;
import com.testmatick.shapes.RightTriangle;
import com.testmatick.shapes.Square;
import com.testmatick.shapes.Trapezoid;

public interface AbstractShapeFactory {
    Circle createCircle();

    Square createSquare();

    Trapezoid createTrapezoid();

    RightTriangle createRightTriangle();
}
