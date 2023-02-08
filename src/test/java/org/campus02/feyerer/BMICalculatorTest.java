package org.campus02.feyerer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator(1.8, 180);
    }

    @Test
    @DisplayName("Test Constructor")
    void testConstructor() {
        Assertions.assertEquals(180, bmiCalculator.getWeightInKG());
        assertEquals(1.8, bmiCalculator.getHeightInMeters());
    }

    @Test
    void result() {

    }
}