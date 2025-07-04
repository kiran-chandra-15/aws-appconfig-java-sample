package com.amazonaws.samples.appconfig.movies;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import com.amazonaws.samples.appconfig.utils.Math;

import static org.junit.Assert.assertEquals;

public class MathTest {

    @Test
    public void testDivide() {
        Math math = new Math();
        math.divide();

        // Test divide(BigDecimal, RoundingMode)
        BigDecimal bd = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(2);
        BigDecimal expectedResult1 = BigDecimal.valueOf(5);
        assertEquals(expectedResult1, bd.divide(bd2, RoundingMode.DOWN));

        // Test divide(BigDecimal, int, RoundingMode)
        BigDecimal expectedResult2 = BigDecimal.valueOf(5.0);
        assertEquals(expectedResult2, bd.divide(bd2, 1, RoundingMode.HALF_UP));

        // Test divide(BigDecimal, int, RoundingMode)
        BigDecimal expectedResult3 = BigDecimal.valueOf(5.0);
        assertEquals(expectedResult3, bd.divide(bd2, 1, RoundingMode.CEILING));

        // Test setScale(int, RoundingMode)
        BigDecimal expectedResult5 = BigDecimal.valueOf(10);
        bd.setScale(2, RoundingMode.HALF_UP);
        assertEquals(expectedResult5, bd);
    }
}
