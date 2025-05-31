import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void shouldAdd(){
        //when
        float a = 3;
        float b = 7;
        //then
        assertEquals(10, Calculator.add(a, b));
    }
    @Test
    void shouldSubtract(){
        //when
        float a = 4;
        float b = 3;
        //then
        assertEquals(1, Calculator.subtract(a, b));
    }
    @Test
    void shouldBeEqual(){
        //when
        float a = 5;
        float b = 5;
        //then
        assertTrue(Calculator.areEqual(a, b));
    }
    @Test
    void shouldNotBeEqual(){
        //when
        float a = 4;
        float b = 2;
        //then
        assertFalse(Calculator.areEqual(a, b));
    }
    @Test
    void threeShouldBeGreaterThanTwo(){
        //when
        float a = 3;
        float b = 2;
        //then
        assertEquals("3.0 is greater", Calculator.findGreater(a, b));
    }
}
