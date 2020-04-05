/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    
    
    @Test
    public void calculatorInitialValueZero(){
        Calculator calc = new Calculator();
        assertEquals(0, calc.getValue());
    }
    
    @Test
    public void valueFiveWhenFiveAdded(){
        Calculator calc = new Calculator();
        calc.sum(5);
        assertEquals(5, calc.getValue());
    }
    
    @Test
    public void valueMinusTwoWhenSubtracted(){
        Calculator calc = new Calculator();
        calc.substract(2);
        assertEquals(-2, calc.getValue());
    }
}
