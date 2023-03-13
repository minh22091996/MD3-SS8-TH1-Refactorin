package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.test.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
//    @Test
//    @DisplayName("test ok")
//    void testCalculateAdd(){
//        int a = 1;
//        int b = 1;
//        char o = '+';
//      int expected = 2;
//
//      int result = Calculator.calculate(a,b,o);
//      assertEquals(expected,result);
//    }

    @Test
    @DisplayName("test ok11")
    void testCalculateAdd(){
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }

}
