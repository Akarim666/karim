package org.exemple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;

    @BeforeEach
    void setUP(){
        calculator=new SimpleCalculator();
    }
    @Test
    void test_if_addition_is_working(){
        assertEquals(22,calculator.Addition(10,12));
    }
    @Test
    void test_if_soustration_is_working(){
        assertEquals(-2,calculator.soustraction(10,12));
    }
    @Test
    void test_if_multiplication_is_working(){
        assertEquals(120,calculator.multiplication(10,12));
    }
    @Test
    void test_if_paire_is_working(){
        //assertEquals(true,calculator.isEven(24));
       // assertTrue(true,calculator.isEven(4));
    }

}