package com.testmatick.shapes;

public class RightTriangle extends Shape {
    private static final String NAME = "трикутник";
    private final Double cathetusOne;
    private final Double cathetusTwo;
    private final Double hypotenuse;

    public RightTriangle(Color color, Double cathetusOne, Double cathetusTwo) {
        super(color);
        this.cathetusOne = cathetusOne;
        this.cathetusTwo = cathetusTwo;
        this.hypotenuse =
            Math.sqrt(Math.pow(cathetusOne, 2) + Math.pow(cathetusTwo, 2));
    }

    public Double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public Double getArea() {
        return cathetusOne * cathetusTwo / 2;
    }

    @Override
    public String toString() {
        return "Фігура: " + NAME +
            ", площа: " + this.getArea() + MeasurementUnit.SQ_UNIT.naming +
            ", гіпотенуза: " + hypotenuse + MeasurementUnit.UNIT.naming +
            super.toString();
    }
}
