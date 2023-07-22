package com.testmatick.shapes;

import java.text.DecimalFormat;

public class Square extends Shape {
    public static final String NAME = "квадрат";
    private final Double side;

    public Square(Color color, Double side) {
        super(color);
        this.side = side;
    }

    public Double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Фігура: " + NAME +
            ", площа: " + decimalFormat.format(this.getArea()) + " "
            + MeasurementUnit.SQ_UNIT.naming +
            ", довжина сторони: " + decimalFormat.format(side) + " "
            + MeasurementUnit.UNIT.naming +
            super.toString();
    }
}
