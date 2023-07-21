package com.testmatick.shapes;

public class Circle extends Shape {

    public static final String NAME = "коло";
    private final Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Фігура: " + NAME +
            ", площа: " + this.getArea() + MeasurementUnit.SQ_UNIT.naming +
            ", радіус: " + radius + MeasurementUnit.UNIT.naming +
            super.toString();
    }
}
