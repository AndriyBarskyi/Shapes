package com.testmatick.shapes;

public class Square extends Shape {
    public static final String NAME = "квадрат";
    private Double side;

    public Square(Color color, Double side) {
        super(color);
        this.side = side;
    }

    public Double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Фігура: " + NAME +
            ", площа: " + this.getArea() + MeasurementUnit.SQ_UNIT.naming +
            ", довжина сторони: " + side + MeasurementUnit.UNIT.naming +
            super.toString();
    }
}
