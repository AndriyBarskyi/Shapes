package com.testmatick.shapes;

public class Trapezoid extends Shape {
    public static final String NAME = "трапеція";
    private Double sideOne;
    private Double sideTwo;
    private Double height;

    public Trapezoid(Color color, Double sideOne, Double sideTwo,
        Double height) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
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
