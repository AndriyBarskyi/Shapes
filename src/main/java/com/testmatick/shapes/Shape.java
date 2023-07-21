package com.testmatick.shapes;


public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract Double getArea();

    public Color getColor() {
        return this.color;
    }

    @Override public String toString() {
        return ", колір: " + color + ".";
    }
}
