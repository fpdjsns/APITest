package com.apitest.Service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JUnitServiceTest {

    JUnitService jUnitService = new JUnitService();

    @Test
    void calculate_ADD_Test() {
        int result = jUnitService.calculate(10, 5, "ADD");
        Assert.assertEquals("10 + 5", 15, result);
    }

    @Test
    void calculate_SUB_Test() {
        int result = jUnitService.calculate(10, 5, "SUB");
        Assert.assertEquals("10 - 5", 5, result);
    }

    @Test
    void calculate_MUL_Test() {
        int result = jUnitService.calculate(10, 5, "MUL");
        Assert.assertEquals("10 * 5", 50, result);
    }

    @Test
    void calculate_DIV_Test() {
        int result = jUnitService.calculate(10, 5, "DIV");
        Assert.assertEquals("10 / 5", 2, result);
    }

    @Test
    void calculate_default_Test() {
        int result = jUnitService.calculate(10, 5, "default");
        Assert.assertEquals("bad request -> maybe result is 0", 0, result);
    }
}