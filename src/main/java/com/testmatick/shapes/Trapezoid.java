package com.testmatick.shapes;

public class Trapezoid extends Shape {
    private static final String NAME = "трапеція";
    private Double sideOne;
    private Double sideTwo;
    private Double height;

    protected Trapezoid(Color color) {
        super(color);
    }

    public Double getArea() {
        return (sideOne + sideTwo) / 2 * height;
    }

    @Override
    public String toString() {
        return "Фігура: " + NAME +
            ", площа: " + this.getArea() + MeasurementUnit.SQ_UNIT.naming +
            ", висота: " + height + MeasurementUnit.UNIT.naming +
            super.toString();
    }
}
