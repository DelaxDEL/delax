package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.model.Calculator;

public class TestMain {
    @Test
    public void testAdd() {
        int result = Calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = Calculator.subtract(5, 2);
        Assertions.assertEquals(3, result);
    }
}