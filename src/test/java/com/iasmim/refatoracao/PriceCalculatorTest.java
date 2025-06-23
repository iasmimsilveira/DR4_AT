package com.iasmim.refatoracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {

    @Test
    public void testCommonCustomerOnNormalDay() {
        PriceCalculator calc = new PriceCalculator();
        double finalPrice = calc.calculateFinalPrice(100.0, 1, false);
        assertEquals(90.0, finalPrice, 0.01);
    }

    @Test
    public void testVipCustomerOnHoliday() {
        PriceCalculator calc = new PriceCalculator();
        double finalPrice = calc.calculateFinalPrice(100.0, 2, true);
        assertEquals(80.0, finalPrice, 0.01); // 15% + 5% = 20%
    }

    @Test
    public void testUnknownCustomer() {
        PriceCalculator calc = new PriceCalculator();
        double finalPrice = calc.calculateFinalPrice(100.0, 999, false);
        assertEquals(100.0, finalPrice, 0.01);
    }
}
