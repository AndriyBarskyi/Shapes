package com.testmatick.shapes;

import java.text.DecimalFormat;

public class Trapezoid extends Shape {
    public static final String NAME = "трапеція";
    private final Double sideOne;
    private final Double sideTwo;
    private final Double height;

    public Double getSideOne() {
        return sideOne;
    }

    public Double getSideTwo() {
        return sideTwo;
    }

    public Double getHeight() {
        return height;
    }

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
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Фігура: " + NAME +
            ", площа: " + decimalFormat.format(this.getArea()) + " "
            + MeasurementUnit.SQ_UNIT.naming +
            ", висота: " + decimalFormat.format(height) + " "
            + MeasurementUnit.UNIT.naming +
            super.toString();
    }
}
