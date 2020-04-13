package com.symbiantech.CalcEngine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathEquationTest {

    @Test
    public void allowOp4Codes() {
        MathEquation eq = new MathEquation();
        eq.setOpCodes('a');
        eq.execute(8,4);
        double resultsVal = eq.getResults();
        assertEquals(12,resultsVal);
    }
}