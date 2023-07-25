package com.testmatick;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.testmatick.shapes.Color;
import com.testmatick.shapes.Trapezoid;

class TrapezoidTest {

    private static final double DELTA = 1e-3;

    private static Stream<Arguments> trapezoidValues() {
        return Stream.of(
            Arguments.of(new Trapezoid(Color.RED, 10.0, 15.0, 8.0), 100.0),
            Arguments.of(new Trapezoid(Color.BLACK, 5.0, 10.0, 5.0), 37.5),
            Arguments.of(new Trapezoid(Color.BLUE, 20.0, 30.0, 10.0), 250.0)
        );
    }

    private static Stream<Arguments> trapezoidToStringValues() {
        return Stream.of(
            Arguments.of(new Trapezoid(Color.RED, 10.0, 15.0, 8.0),
                "Фігура: " + Trapezoid.NAME
                    + ", площа: 100 кв.од., висота: 8 од., колір: "
                    + Color.RED.naming + "."),
            Arguments.of(new Trapezoid(Color.BLACK, 5.0, 10.0, 5.0),
                "Фігура: " + Trapezoid.NAME
                    + ", площа: 37,5 кв.од., висота: 5 од., колір: "
                    + Color.BLACK.naming + "."),
            Arguments.of(new Trapezoid(Color.BLUE, 20.0, 30.0, 10.0),
                "Фігура: " + Trapezoid.NAME
                    + ", площа: 250 кв.од., висота: 10 од., колір: "
                    + Color.BLUE.naming + ".")
        );
    }

    private static Stream<Arguments> trapezoidNegativeParameters() {
        return Stream.of(
            Arguments.of(Color.RED, -10.0, 15.0, 8.0),
            Arguments.of(Color.BLACK, 5.0, -10.0, 5.0),
            Arguments.of(Color.BLUE, 20.0, 30.0, -10.0),
            Arguments.of(Color.YELLOW, 20.0, -30.0, -10.0),
            Arguments.of(Color.PINK, -20.0, -30.0, 10.0),
            Arguments.of(Color.PURPLE, -20.0, 30.0, -10.0),
            Arguments.of(Color.GREEN, -20.0, -30.0, -10.0)
        );
    }

    @ParameterizedTest
    @MethodSource("trapezoidValues")
    void testGetArea(Trapezoid trapezoid,
        double expectedArea) {
        Assertions.assertEquals(expectedArea, trapezoid.getArea(), DELTA);
    }

    @ParameterizedTest
    @MethodSource("trapezoidToStringValues")
    void testToString(Trapezoid trapezoid, String expectedString) {
        Assertions.assertEquals(expectedString, trapezoid.toString());
    }

    @ParameterizedTest
    @MethodSource("trapezoidNegativeParameters")
    void testThrowsIllegalArgumentExceptionWhenNegativeParameters(Color color,
        double sideOne, double sideTwo, double height) {
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> new Trapezoid(color, sideOne, sideTwo, height));
    }

}