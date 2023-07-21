package com.testmatick.shapes;

public enum MeasurementUnit {
    UNIT("од."),
    SQ_UNIT("кв.од."),;

    public final String naming;

    MeasurementUnit(String naming) {
        this.naming = naming;
    }
}
